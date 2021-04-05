package com.aplus.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aplus.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
