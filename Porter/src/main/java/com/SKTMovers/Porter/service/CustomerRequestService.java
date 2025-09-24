package com.SKTMovers.Porter.service;


import java.util.List;
import org.springframework.stereotype.Service;

import com.SKTMovers.Porter.entity.CustomerRequest;
import com.SKTMovers.Porter.repository.CustomerRequestRepository;

@Service
public class CustomerRequestService {

    private final CustomerRequestRepository repository;

    public CustomerRequestService(CustomerRequestRepository repository) {
        this.repository = repository;
    }

    public CustomerRequest saveRequest(CustomerRequest request) {
        return repository.save(request);
    }

    public List<CustomerRequest> getAllRequests() {
        return repository.findAll();
    }
}
