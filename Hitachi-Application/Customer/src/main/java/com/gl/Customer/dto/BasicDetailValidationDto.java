package com.gl.Customer.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BasicDetailValidationDto {

    private String emailAddress;
    private String dateOfBirth;

}
