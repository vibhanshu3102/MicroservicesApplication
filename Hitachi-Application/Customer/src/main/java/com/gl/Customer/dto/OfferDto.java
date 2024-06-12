package com.gl.Customer.dto;

import com.gl.Customer.entity.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OfferDto {

    private Customer customer;
    private OrderDto orderDto;
}
