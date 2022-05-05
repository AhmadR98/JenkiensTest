package com.example.fraud.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class DtoRequst {

    private Long customerId;
    private boolean isFuardster;
    private LocalDateTime createdAt;
}
