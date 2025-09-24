package com.SKTMovers.Porter.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SKTMovers.Porter.entity.CustomerRequest;
import com.SKTMovers.Porter.repository.CustomerRequestRepository;

@CrossOrigin(origins = "http://localhost:8081 , http://localhost:8082") // allow frontend
@RestController
@RequestMapping("/api/requests")
public class CustomerRequestController {

    @Autowired
    private CustomerRequestRepository customerRequestRepository;

    // GET all requests
    @GetMapping("/all")
    public List<CustomerRequest> getAllRequests() {
        return customerRequestRepository.findAll();
    }

    // POST create new request
    @PostMapping("/create")
    public ResponseEntity<CustomerRequest> createRequest(@RequestBody CustomerRequest request) {
        CustomerRequest saved = customerRequestRepository.save(request);
        return ResponseEntity.ok(saved);   // this returns JSON
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteRequest(@PathVariable Long id) {
    	customerRequestRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}












