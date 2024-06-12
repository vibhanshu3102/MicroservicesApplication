package com.gl.Service.dto;

import com.gl.Service.entity.SimDetails;
import com.gl.Service.entity.SimOffers;
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
