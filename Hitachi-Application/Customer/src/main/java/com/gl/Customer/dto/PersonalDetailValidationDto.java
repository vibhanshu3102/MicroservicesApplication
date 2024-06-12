package com.gl.Customer.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonalDetailValidationDto {

    @NotNull(message = "First Name Cannot be Null")
    @Size(min = 0, max = 15 , message = "Invalid size of first name")
    private String firstName;

    @NotNull(message = "Last Name Cannot be Null")
    @Size(min = 0, max = 15 , message = "Invalid size of Last name")
    private String lastname;

    @NotNull(message = "Email address cannot be null")
    @Email(message = "Invalid email address")
    private String confirmEmail;
}
