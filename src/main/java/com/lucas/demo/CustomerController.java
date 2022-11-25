package com.lucas.demo;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomerController.class);

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/")
    public List<Customer> getAllCustomers() {
        List<Customer> customers = customerService.findAllOrders();
        customers.forEach(customer -> LOGGER.info("Customer found: {}", customer));
        return customerService.findAllOrders();
    }

}
