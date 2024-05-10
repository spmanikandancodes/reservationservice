package com.example.Reservation.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {


    private static final String TOPIC = "bookingnotification";

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;


    public void sendReservationConfirm(String message)

    {
        this.kafkaTemplate.send(TOPIC, message);

    }

}
