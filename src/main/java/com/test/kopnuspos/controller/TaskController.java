package com.test.kopnuspos.controller;

import com.test.kopnuspos.model.TaskRequest;
import com.test.kopnuspos.model.TblTask;
import com.test.kopnuspos.model.UserRequest;
import com.test.kopnuspos.repository.TblTaskRepository;
import com.test.kopnuspos.repository.TblUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping(value = "task")
public class TaskController {

    @Autowired
    TblTaskRepository tblTaskRepository;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ResponseEntity<?> addTask(@RequestBody TaskRequest taskRequest) {
        TblTask tblTask = TblTask.fromSourceObject(taskRequest);
        return ResponseEntity.ok(tblTaskRepository.save(tblTask));
    }

    @RequestMapping(value = "/getall", method = RequestMethod.GET)
    public ResponseEntity<?> getTask() {
        return ResponseEntity.ok(tblTaskRepository.findAll(Sort.by(Sort.Direction.ASC, "id")));
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getTaskById(@PathVariable int id) {
        return ResponseEntity.ok(tblTaskRepository.findById(id).get());
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    public ResponseEntity<?> updateTask(@RequestBody TaskRequest taskRequest, @PathVariable int id) {
        TblTask tblTask = tblTaskRepository.findById(id).get();
        tblTask.setDeskripsi(taskRequest.getDeskripsi());
        tblTask.setJudul(taskRequest.getJudul());
        tblTask.setWaktu(taskRequest.getWaktu());
        return ResponseEntity.ok(tblTaskRepository.save(tblTask));
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.POST)
    public ResponseEntity<?> deleteTask(@PathVariable int id) {
        tblTaskRepository.deleteById(id);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("message", "success delete task");
        map.put("id", id);
        return ResponseEntity.ok(map);
    }
}
