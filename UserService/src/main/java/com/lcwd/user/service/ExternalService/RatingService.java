package com.lcwd.user.service.ExternalService;

import com.lcwd.user.service.entities.Rating;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@FeignClient(name = "RATING-SERVICE")
public interface RatingService {

    //post
    @PostMapping("/ratings")
    public ResponseEntity<Rating> createRating(Rating values);

    //Put
    @PutMapping("/ratings/{ratingId}")
    public ResponseEntity<Rating> updateRating(@PathVariable("ratingId") String ratingId, Rating rating);

    //Delete
    @DeleteMapping("/rating/{ratingId}")
    public void deleteRating(@PathVariable String ratingId);
}
