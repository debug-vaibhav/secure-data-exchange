package com.workshop.demo.service;

import com.workshop.demo.entity.Hotel;
import com.workshop.demo.model.RoomsDTO;
import com.workshop.demo.repo.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class PropertyServiceImpl implements PropertyService {

    HotelRepository hotelRepository;

    @Autowired
    public PropertyServiceImpl(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    List<RoomsDTO> getHotelCapacities() {
        return new ArrayList<>();
    }

    @Override
    public void getHotelDetails(String hotelCode) {
        Hotel hotel = hotelRepository.getHotelByCode(hotelCode);

    }
}
