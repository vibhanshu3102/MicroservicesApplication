package com.gl.Customer.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    @Id
    private long uniqueIdNumber;
    private String dateOfBirth;
    private String emailAddress;
    private String firstName;
    private String lastName;
    private String idType;
    private String state;
    private Integer adressId;
    private Integer simId;
}