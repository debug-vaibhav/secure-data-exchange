package com.workshop.demo.service;

import org.springframework.stereotype.Service;

@Service
public interface PropertyService {
    void getHotelDetails(String hotelCode);
}
