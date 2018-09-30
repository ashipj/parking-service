package com.ash.parkingservice.controller;

import com.ash.parkingservice.model.ParkingSpot;
import com.ash.parkingservice.service.ParkingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ParkingController {

    @Autowired
    ParkingService parkingService;

    @RequestMapping("/parking/list")
    public List<ParkingSpot> list() {
        return parkingService.list();
    }
}
