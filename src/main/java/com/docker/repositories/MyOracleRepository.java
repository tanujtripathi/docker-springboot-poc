package com.docker.repositories;

import com.docker.entity.TestEntity;
import org.springframework.data.repository.CrudRepository;

public interface MyOracleRepository extends CrudRepository<TestEntity, Integer> {
}
