package com.example.fraud.services;

import com.example.fraud.dto.DtoRequst;
import com.example.fraud.dto.DtoResponse;
import com.example.fraud.entities.Fraud;
import com.example.fraud.records.FraudCheckResponse;
import com.example.fraud.repositry.FraudRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class FraudService {
    @Autowired
    private FraudRepo fraudRepo;
    @Autowired
    private ModelMapper mapper;

    public Boolean isFraudulentCoustomer(Long id ) {
        fraudRepo.save(
                Fraud.builder()
                        .customerId(id)
                        .isFuardster(false)
                        .createdAt(LocalDateTime.now())
                        .build()
        );
        return  false;
    }



    }

