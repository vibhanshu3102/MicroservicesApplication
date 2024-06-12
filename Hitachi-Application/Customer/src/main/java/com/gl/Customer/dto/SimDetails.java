package com.gl.Customer.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SimDetails {
    private int simId;
    private long serviceNumber;
    private long simNumber;
    private String simStatus;

}
