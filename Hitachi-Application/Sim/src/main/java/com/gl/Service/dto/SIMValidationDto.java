package com.gl.Service.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SIMValidationDto {

    @NotNull(message = "Please Enter A service number....")
    @Size(min = 10 , max = 10 , message = "Not valid Sim Number")
    private long serviceNumber;
    @NotNull(message = "Please Enter A sim Number....")
    @Size(min = 13 , max = 13 , message = "Not valid Sim Number")
    private long simNumber;
}