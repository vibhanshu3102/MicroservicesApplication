package com.gl.Customer.controller;


import com.gl.Customer.dto.BasicDetailValidationDto;
import com.gl.Customer.dto.OfferDto;
import com.gl.Customer.dto.PersonalDetailValidationDto;
import com.gl.Customer.entity.CustomerAddress;
import com.gl.Customer.services.CustomerService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@Validated
//@RequestMapping("/api/v1")
public class CustomerController {

    //Autowire Service.
    @Autowired
    CustomerService customerService;

    //US03
    @PostMapping("/validateBasicdetails")
    public ResponseEntity<String> validateCustomerBasicDetails(@RequestBody BasicDetailValidationDto basicDetailValidationDto) {

        //Write your code here
        String result = customerService.validateBasicDetails(basicDetailValidationDto);
        return ResponseEntity.ok(result);
    }

    //US04
    @PostMapping("/validatePersonalDetails")
    public ResponseEntity<String> validateCustomerPersonalDetails(@RequestBody PersonalDetailValidationDto personalDetailValidationDto) {

        //Write your code here
        String Result = customerService.validatePersonalDetails(personalDetailValidationDto).toString();
        return ResponseEntity.ok(Result);
    }

    //US05
    @PutMapping("/updateAddress/{uniqueId}")
    public ResponseEntity<CustomerAddress> updateCustomerAddress(@Valid @RequestBody CustomerAddress customerAddress, @PathVariable Integer uniqueId) {

        //Write your code here
        // String result = customerService.customerAddressValidation(customerAddress , uniqueId).toString();
        CustomerAddress customerAddress1 = customerService.customerAddressValidation(customerAddress , uniqueId);
        return ResponseEntity.ok(customerAddress1);
    }
    //US07
    @GetMapping("/getorderinfo/{uniqueId}")
    public OfferDto getOrderInfo(@PathVariable long uniqueId){
        return customerService.getOrder(uniqueId);
    }
}
