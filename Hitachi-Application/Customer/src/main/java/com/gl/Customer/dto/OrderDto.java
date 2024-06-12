package com.gl.Customer.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderDto {
 private SimDetails simDetails;
 private SimOffers simOffers;
}
