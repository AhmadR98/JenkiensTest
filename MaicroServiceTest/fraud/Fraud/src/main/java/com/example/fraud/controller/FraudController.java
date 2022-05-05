package com.example.fraud.controller;


import com.example.fraud.records.FraudCheckResponse;
import com.example.fraud.services.FraudService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "fraud")
public class FraudController {
    @Autowired
    private FraudService fraudService;

    @GetMapping(path = "/{id}")
    public FraudCheckResponse isFraudster(@PathVariable Long id) {
        boolean isFraudulentCustomer = fraudService.isFraudulentCoustomer(id);
        return new FraudCheckResponse(isFraudulentCustomer);
    }


}
