package com.docker.services;

import com.docker.entity.EmployeeEntity;
import com.docker.entity.TestEntity;
import com.docker.model.Employee;
import com.docker.model.Test;
import com.docker.repositories.MyOracleRepository;
import com.docker.repositories.MyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService implements MyServices {

    @Autowired
    private MyRepository repository;

    @Autowired
    private MyOracleRepository oracleRepository;

    public void saveIntoDB(Employee employee) {
        EmployeeEntity employeeEntity = new EmployeeEntity();
        employeeEntity.setName(employee.getName());
        repository.save(employeeEntity);
    }

    @Override
    public void saveIntoOracleDB(Test test) {
        TestEntity testEntity = new TestEntity();
        testEntity.setName(test.getName());
        oracleRepository.save(testEntity);
    }
}
