package com.example.Reservation.demo.controller;

import com.example.Reservation.demo.entity.ReservationEntity;
import com.example.Reservation.demo.repository.ReservationRepository;
import com.example.Reservation.demo.service.ReservationService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/reservations")
public class ReservationController {

    @Autowired
    ReservationService reservationService;

    @Autowired
    ReservationRepository reservationRepository;

    @PostMapping("/makeReservation")
    public ResponseEntity<ReservationEntity> makeReservation(@RequestBody ReservationEntity reservationEntity) {

             return ResponseEntity.ok(reservationService.makeReserve(reservationEntity));

           }

    @GetMapping("/allReservations")
    public List<ReservationEntity> getAllReservation() {
        return reservationRepository.findAll();
    }




}
