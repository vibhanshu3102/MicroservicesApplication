package com.gl.Customer.Client;

import com.gl.Customer.dto.OrderDto;
import com.gl.Customer.dto.SimDetails;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "Sim")
public interface CustomerClient {

    @GetMapping("/getsimDetail/{simId}")
    public OrderDto getsimDetail(@PathVariable Integer simId);

}
