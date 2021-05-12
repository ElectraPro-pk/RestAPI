package com.example.restservice.RestApi.resource;

import com.example.restservice.RestApi.model.address;
import com.example.restservice.RestApi.model.user;
import com.example.restservice.RestApi.repository.addressRepo;
import com.example.restservice.RestApi.repository.userRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping(value="/api/")
public class userResource {
    @Autowired
    userRepo userReposit;

    @Autowired
    addressRepo addRepo;

    @PostMapping(value="address/new")
    public address getUser(@RequestBody final address a){
        addRepo.save(a);
        return a;
    }
    @GetMapping(value="get-address")
    public List<address> getAddress(@RequestBody final user u){
        return addRepo.findByuserID(u.getId());
    }
    @GetMapping(value="users/all")
    public List<user> getUsers(){
        return userReposit.findAll();
    }

    @PostMapping(value = "/users/new")
    public user persist(@RequestBody final user u){
        userReposit.save(u);
        return u;
    }

}
