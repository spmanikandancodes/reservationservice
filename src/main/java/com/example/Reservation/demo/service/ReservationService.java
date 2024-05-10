package com.example.Reservation.demo.service;

import com.example.Reservation.demo.entity.ReservationEntity;
import com.example.Reservation.demo.repository.ReservationRepository;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {


    @Autowired
    ReservationRepository reservationRepository;

    @Autowired
    KafkaProducerService kafkaProducerService;

    private KafkaTemplate<String, String> kafkaTemplate;

    public ReservationEntity makeReserve(ReservationEntity reservationEntity) {

        ReservationEntity newreservation = reservationRepository.save(reservationEntity);

        kafkaProducerService.sendReservationConfirm("Reservation successful");

         return newreservation;
    }

}
