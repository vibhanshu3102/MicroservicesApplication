package com.gl.Service.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SimOffers {

    //For the below data members add required validations
    // Also include ORM mapping required as per given DB schema amd problem statement..

    @Id
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
