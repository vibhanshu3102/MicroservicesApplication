package com.gl.Customer.repository;

import com.gl.Customer.entity.CustomerIdentity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerIdentityRepository extends JpaRepository<CustomerIdentity, Long> {

    @Query("SELECT firstName from CustomerIdentity where emailAddress = :email")
    public String checkFirstName(@Param("email") String email);

    @Query("SELECT lastName from CustomerIdentity where emailAddress = :email")
    public String checkLastName(@Param("email") String email);

    @Query("SELECT emailAddress from CustomerIdentity")
    public List<String> listOfEmail();


}
