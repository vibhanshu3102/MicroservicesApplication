package com.gl.Customer.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerAddress {

    //For the below data members add required validations
    // Also include ORM mapping required as per given DB schema amd problem statement..

    @Id
    private int addresId;
    private String address;
    private String city;
    private int pinCode;
    private String state;

}