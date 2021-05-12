package com.example.restservice.RestApi.repository;

import com.example.restservice.RestApi.model.address;
import com.example.restservice.RestApi.model.user;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.HashMap;
import java.util.List;

public interface addressRepo extends JpaRepository<address,Integer> {
        List<address> findByuserID(int uId);


}
