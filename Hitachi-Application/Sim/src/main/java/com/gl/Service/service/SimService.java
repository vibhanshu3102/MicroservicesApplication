package com.gl.Service.service;

import com.gl.Service.dto.OrderDto;
import com.gl.Service.dto.SIMValidationDto;
import com.gl.Service.entity.SimDetails;
import com.gl.Service.entity.SimOffers;
import com.gl.Service.repository.SimDetailsRepository;
import com.gl.Service.repository.SimOffersRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SimService {


    @Autowired
    SimDetailsRepository simDetailsRepository;

    @Autowired
    SimOffersRepository simOffersRepository;

    public String validateSIM(SIMValidationDto simValidationDto) {

        String Status = simDetailsRepository.getStatus(simValidationDto.getServiceNumber() , simValidationDto.getSimNumber());
        if(Status.equals("active")){
            return "SIM already active";
        }
        else {
            return "Valid details. Welcome!!.";
        }
    }


    public String getSimOffer(Integer simId) {
        SimOffers simOffers = simOffersRepository.findById(simId).get();
        return simOffers.toStringMessage();
    }

    public OrderDto getSimDetail(Integer simId) {
        OrderDto orderDto = new OrderDto();
        orderDto.setSimDetails(simDetailsRepository.findById(simId).get());
        orderDto.setSimOffers(simOffersRepository.findBySimId(simId));
        return orderDto;
    }

    @Transactional
    public String activateSim(Integer simId) {
        String status = simDetailsRepository.getSim(simId);
        if(status.equals("inactive")){
            Integer update = simDetailsRepository.setSimStatus(simId);
            return "Sim is now ACTIVE";
        }
        else{
            return "User is aleready active";
        }
    }
}
