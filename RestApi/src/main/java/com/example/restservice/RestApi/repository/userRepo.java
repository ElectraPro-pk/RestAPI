package com.example.restservice.RestApi.repository;

import com.example.restservice.RestApi.model.user;
import org.springframework.data.jpa.repository.JpaRepository;


public interface userRepo extends JpaRepository<user,Integer> {

}
