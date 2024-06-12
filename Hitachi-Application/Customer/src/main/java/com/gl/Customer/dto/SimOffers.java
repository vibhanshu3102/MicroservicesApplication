package com.gl.Customer.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SimOffers {
    private int offerId;
    private int callQty;
    private int cost;
    private int dataQty;
    private int duration;
    private String offerName;
    private int simId;

    //  100 calls + 120 Gb for Rs. 100, Validity : 10 days."

    public String toStringMessage() {
        return callQty + " calls + " + dataQty + "Gb for Rs. " +  cost + ", Validity : " + duration + "days.";
    }
}
