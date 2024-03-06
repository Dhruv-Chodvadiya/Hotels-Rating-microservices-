package com.lcwd.hotel.HotalService.controllers;

import com.lcwd.hotel.HotalService.entities.Hotel;
import com.lcwd.hotel.HotalService.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {


    @Autowired
    private HotelService hotelService;


    //create
    @PostMapping
    public ResponseEntity<Hotel> createUser(@RequestBody Hotel hotel){
        Hotel hotel1 = hotelService.create(hotel);
        return ResponseEntity.status(HttpStatus.CREATED).body(hotel1);
    }

    //single hotel get
    @GetMapping("/{hotelId}")
    public ResponseEntity<Hotel> getSingleHotel(@PathVariable String hotelId){
        Hotel hotel = hotelService.get(hotelId);
        return ResponseEntity.ok(hotel);
    }

    //all hotel get
    @GetMapping
    public ResponseEntity<List<Hotel>> getAllHotel(){
        List<Hotel> allHotel = hotelService.getAll();
        return ResponseEntity.ok(allHotel);
    }
}
