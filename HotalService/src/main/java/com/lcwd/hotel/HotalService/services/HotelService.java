package com.lcwd.hotel.HotalService.services;

import com.lcwd.hotel.HotalService.entities.Hotel;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface HotelService {
    //create
    Hotel create(Hotel hotel);
    //get all
    List<Hotel> getAll();
    //single get
    Hotel get(String id);
}
