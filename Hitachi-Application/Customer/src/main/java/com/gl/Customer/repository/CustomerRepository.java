package com.gl.Customer.repository;

import com.gl.Customer.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    @Query("SELECT  emailAddress from Customer")
    public List<String> emailList();
    @Query("SELECT  dateOfBirth from Customer")
    public List<String> dobList();
    @Query("SELECT simId from Customer WHERE uniqueIdNumber = :uniqueId")
    public Integer getSimIdFromUniqueId(@Param("uniqueId") long uniqueId);


}
