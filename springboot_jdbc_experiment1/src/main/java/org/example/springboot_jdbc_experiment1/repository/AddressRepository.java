package org.example.springboot_jdbc_experiment1.repository;

import org.example.springboot_jdbc_experiment1.dox.Address;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressRepository extends CrudRepository<Address,String> {
    @Query(
            """
             select * from address a 
         where a.user_id=:userId"""
    )
    List<Address> findByUserId(String userId);
}
