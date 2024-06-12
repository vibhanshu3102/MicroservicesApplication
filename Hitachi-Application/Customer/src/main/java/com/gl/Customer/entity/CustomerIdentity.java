package com.gl.Customer.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerIdentity {

    //For the below data members add required validations
    // Also include ORM mapping required as per given DB schema amd problem statement..

    @Id
    private long uniqueIdNumber;
    private String dateOfBirth;

    private String emailAddress;
    private String firstName;
    private String lastName;
    private String state;
}
