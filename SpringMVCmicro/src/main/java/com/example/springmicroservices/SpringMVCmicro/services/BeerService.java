package com.example.springmicroservices.SpringMVCmicro.services;

import com.example.springmicroservices.SpringMVCmicro.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);
}
