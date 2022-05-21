package com.example.springmicroservices.SpringMVCmicro.services;

import com.example.springmicroservices.SpringMVCmicro.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {

   public CustomerDto getCustomerById(UUID customerId);

    CustomerDto saveNewCustomer(CustomerDto customerDto);

    void updateCustomer(UUID customerId, CustomerDto customerDto);

    void deleteCustomerById(UUID customerId);
}
