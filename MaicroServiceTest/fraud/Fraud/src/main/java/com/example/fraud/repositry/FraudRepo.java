package com.example.fraud.repositry;

import com.example.fraud.entities.Fraud;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FraudRepo extends JpaRepository<Fraud , Long> {
}
