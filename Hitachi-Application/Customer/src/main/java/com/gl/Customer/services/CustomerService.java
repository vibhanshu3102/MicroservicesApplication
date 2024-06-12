package com.gl.Customer.services;

import com.gl.Customer.Client.CustomerClient;
import com.gl.Customer.dto.BasicDetailValidationDto;
import com.gl.Customer.dto.OfferDto;
import com.gl.Customer.dto.PersonalDetailValidationDto;
import com.gl.Customer.entity.CustomerAddress;
import com.gl.Customer.repository.CustomerAddressRepository;
import com.gl.Customer.repository.CustomerIdentityRepository;
import com.gl.Customer.repository.CustomerRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    CustomerIdentityRepository customerIdentityRepository;

    @Autowired
    CustomerAddressRepository customerAddressRepository;

    @Autowired
    CustomerClient customerClient;


    public String validateBasicDetails(BasicDetailValidationDto basicDetailvalidationDto) {
        List<String> emailList = customerRepository.emailList();
        List<String> dobList = customerRepository.dobList();
        System.out.println(dobList.size());
        for (int i = 0 ; i < dobList.size(); i++){
            if(emailList.get(i).equals(basicDetailvalidationDto.getEmailAddress()) && dobList.get(i).equals(basicDetailvalidationDto.getDateOfBirth())){
                return "valid user";
            }
        }
        return "No request placed for you.";
    }

    public String validatePersonalDetails(PersonalDetailValidationDto personalDetailValidationDto) {
        //Write your business logic here
        List<String> emailList = customerIdentityRepository.listOfEmail();
        for (int i = 0; i < emailList.size(); i++){
            if(emailList.get(i).equals(personalDetailValidationDto.getConfirmEmail())){
                if(personalDetailValidationDto.getFirstName().equals(customerIdentityRepository.checkFirstName(personalDetailValidationDto.getConfirmEmail())))
                {
                    if (personalDetailValidationDto.getLastname().equals(customerIdentityRepository.checkLastName(personalDetailValidationDto.getConfirmEmail()))){
                        return "valid user";
                    }
                }
            }
        }
        return "Invalid user";
    }

    @Transactional
    public CustomerAddress customerAddressValidation(CustomerAddress customerAddress, Integer uniqueId) {
        Integer res = customerAddressRepository.updateAdress(customerAddress.getAddress() , uniqueId , customerAddress.getCity() , customerAddress.getPinCode() , customerAddress.getState());
        CustomerAddress customerAddress1 = customerAddressRepository.findById(uniqueId).get();
        if(res>0){
            return customerAddress1;
        }
        return customerAddress;
    }

    public OfferDto getOrder(long uniqueId) {
        OfferDto offerDto = new OfferDto();
        System.out.println(customerRepository.getSimIdFromUniqueId(uniqueId));
        offerDto.setOrderDto(customerClient.getsimDetail(customerRepository.getSimIdFromUniqueId(uniqueId)));
        offerDto.setCustomer(customerRepository.findById(uniqueId).get());
        return offerDto;
    }
}
