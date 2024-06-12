package com.gl.Service.controller;

import com.gl.Service.dto.OrderDto;
import com.gl.Service.dto.SIMValidationDto;
import com.gl.Service.entity.SimDetails;
import com.gl.Service.service.SimService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Currency;

@RestController
public class SimController {
    @Autowired
    SimService simService;

    //US01
    @PostMapping("/validateSIM")
    public ResponseEntity<String> validateSIM(@Valid @RequestBody SIMValidationDto simValidationDto) {

        //Write your code here
        String result = simService.validateSIM(simValidationDto);
        return ResponseEntity.ok(result);
    }

    //US02
    @GetMapping("/getsimoffers/{simId}")
    public String getSimOffers(@PathVariable Integer simId){
        return simService.getSimOffer(simId);
    }
    //FEIGN CLIENT
    @GetMapping("/getsimDetail/{simId}")
    public OrderDto getsimDetail(@PathVariable Integer simId){
        return  simService.getSimDetail(simId);
    }

    //US08
    @PostMapping("/setStatusActive/{simId}")
    public ResponseEntity<String> activateSIM(@PathVariable Integer simId) {

        //Write your code here
        String result = simService.activateSim(simId);
        return ResponseEntity.ok(result);
    }
}
