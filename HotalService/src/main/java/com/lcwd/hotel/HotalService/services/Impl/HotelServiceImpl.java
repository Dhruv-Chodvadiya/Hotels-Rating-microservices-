package com.lcwd.hotel.HotalService.services.Impl;

import com.lcwd.hotel.HotalService.entities.Hotel;
import com.lcwd.hotel.HotalService.exceptions.ResourceNotFoundException;
import com.lcwd.hotel.HotalService.repositories.HotelRepository;
import com.lcwd.hotel.HotalService.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImpl implements HotelService {
    @Autowired
    private HotelRepository hotelRepository;
    @Override
    public Hotel create(Hotel hotel) {
        String hotelId = UUID.randomUUID().toString();
        hotel.setId(hotelId);
        return hotelRepository.save(hotel);
    }

    @Override
    public List<Hotel> getAll() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel get(String id) {
        return hotelRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Given id not found !!"));
    }
}
