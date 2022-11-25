package com.lucas.demo;

import com.google.common.collect.ImmutableList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> findAllOrders() {
        return ImmutableList.copyOf(customerRepository.findAll());
    }

}
