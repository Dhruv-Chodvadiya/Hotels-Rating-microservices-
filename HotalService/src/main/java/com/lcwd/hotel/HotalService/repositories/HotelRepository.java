package com.lcwd.hotel.HotalService.repositories;

import com.lcwd.hotel.HotalService.entities.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel,String> {

}
