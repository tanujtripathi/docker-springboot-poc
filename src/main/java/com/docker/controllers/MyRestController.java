package com.docker.controllers;

import com.docker.entity.TestEntity;
import com.docker.model.Employee;
import com.docker.model.Test;
import com.docker.services.MyServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

    @Autowired
    @Qualifier("myService")
    private MyServices myServices;

    @GetMapping("/health")
    public String healthCheck() {
        return "Application is up";
    }

    @PostMapping("/save")
    public void saveIntoH2DB(@RequestBody Employee employee) {
        myServices.saveIntoDB(employee);
    }

    @PostMapping("/saveInOracleDB")
    public void saveInOracleDB(@RequestBody Test test) {
        myServices.saveIntoOracleDB(test);
    }
}