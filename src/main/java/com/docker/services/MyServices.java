package com.docker.services;


import com.docker.model.Employee;
import com.docker.model.Test;

public interface MyServices {

    void saveIntoDB(Employee employee);

    void saveIntoOracleDB(Test test);
}
