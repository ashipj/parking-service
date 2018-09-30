package com.ash.parkingservice.service;

import com.ash.parkingservice.model.ParkingSpot;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ParkingService {
    public List<ParkingSpot> list() {
        List<ParkingSpot> parkingSpots = new ArrayList<>();
        parkingSpots.add(new ParkingSpot(1.1, 1.2));
        parkingSpots.add(new ParkingSpot(2.1, 2.2));
        parkingSpots.add(new ParkingSpot(3.1, 3.2));
        return parkingSpots;
    }
}
