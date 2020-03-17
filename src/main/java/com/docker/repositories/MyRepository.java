package com.docker.repositories;

import com.docker.entity.EmployeeEntity;
import org.springframework.data.repository.CrudRepository;

public interface MyRepository extends CrudRepository<EmployeeEntity, Long> {
}
