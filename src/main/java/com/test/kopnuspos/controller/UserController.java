package com.test.kopnuspos.controller;

import com.test.kopnuspos.model.TblUser;
import com.test.kopnuspos.repository.TblUserRepository;
import com.test.kopnuspos.service.UserInfoService;
import com.test.kopnuspos.model.JwtRequest;
import com.test.kopnuspos.model.JwtResponse;
import com.test.kopnuspos.model.UserRequest;
import com.test.kopnuspos.service.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtService jwtService;

    @Autowired
    private UserInfoService userDetailsService;

    @Autowired
    private TblUserRepository repository;

    @RequestMapping(value = "/token", method = RequestMethod.POST)
    public ResponseEntity<?> createAuthenticationToken(@RequestBody JwtRequest authenticationRequest) throws Exception {


        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(), authenticationRequest.getPassword()));

        final UserDetails userDetails = userDetailsService
                .loadUserByUsername(authenticationRequest.getUsername());


        if (authentication.isAuthenticated() && userDetails!=null) {
            final String token = jwtService.generateToken(userDetails);
            return ResponseEntity.ok(new JwtResponse(token));
        } else {
            throw new UsernameNotFoundException("invalid user request !");
        }
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public ResponseEntity<?> saveUser(@RequestBody UserRequest user) throws Exception {
        TblUser tblUser = repository.findByUsername(user.getUsername());
        if(tblUser!=null){
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("message", "username already exist");
            map.put("username", tblUser.getUsername());
            return ResponseEntity.ok(map);
        }
        return ResponseEntity.ok(userDetailsService.save(user));
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(){
        System.out.println("halo");
        return "halo";
    }
}
