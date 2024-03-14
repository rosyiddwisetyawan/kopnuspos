package com.test.kopnuspos.repository;

import com.test.kopnuspos.model.TblUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TblUserRepository extends JpaRepository<TblUser, Integer> {

    TblUser findByUsername(String username);
}