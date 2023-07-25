package com.workshop.demo.rest;

import com.workshop.demo.model.HotelDTO;
import com.workshop.demo.model.RoomsDTO;
import com.workshop.demo.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PropertyController {

    PropertyService propertyService;

    @Autowired
    public PropertyController(PropertyService propertyService) {
        this.propertyService = propertyService;
    }

    @GetMapping("/rooms")
    List<RoomsDTO> getRoomsDetails(String hotelCode) {
//        propertyService.getRooms
        return new ArrayList<>();
    }

    List<HotelDTO> getHotelDetails(String hotelCode) {
        propertyService.getHotelDetails(hotelCode);
        return new ArrayList<>();
    }
}
