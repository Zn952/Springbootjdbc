package org.example.springboot_jdbc_experiment1.repository;

import org.example.springboot_jdbc_experiment1.dox.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, String> {






}
