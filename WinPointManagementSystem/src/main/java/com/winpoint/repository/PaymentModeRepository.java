package com.winpoint.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.winpoint.model.PaymentMode;

public interface PaymentModeRepository extends JpaRepository<PaymentMode, Integer>{

}
