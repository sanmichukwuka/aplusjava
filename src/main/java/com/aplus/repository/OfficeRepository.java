package com.aplus.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aplus.model.OfficeScheduler;


public interface OfficeRepository extends JpaRepository<OfficeScheduler, Long> {
	OfficeScheduler aggregatePrice = null;

	Optional<OfficeScheduler> findByEmail(String email);
}
