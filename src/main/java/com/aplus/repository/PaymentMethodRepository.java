package com.aplus.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aplus.model.PaymentMethod;

public interface PaymentMethodRepository extends JpaRepository<PaymentMethod, Long> {

}
