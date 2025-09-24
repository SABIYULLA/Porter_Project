package com.SKTMovers.Porter.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SKTMovers.Porter.entity.CustomerRequest;

public interface CustomerRequestRepository extends JpaRepository<CustomerRequest, Long> {
}