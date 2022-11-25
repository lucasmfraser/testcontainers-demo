package com.lucas.demo;

import static org.assertj.core.api.Assertions.assertThat;

import com.google.common.collect.ImmutableList;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CustomerServiceIT {

    @Autowired
    private CustomerRepository customerRepository;

    @Test
    void when() {
        List<Customer> customers = ImmutableList.copyOf(customerRepository.findAll());
        assertThat(customers).isEmpty();
    }

}
