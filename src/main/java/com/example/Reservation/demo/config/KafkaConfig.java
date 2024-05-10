package com.example.Reservation.demo.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;



public class KafkaConfig {


        @Value("${spring.kafka.topic.bookingnotification}")
        private String bookingT;

        public NewTopic topicBooking() {
            return TopicBuilder.name(bookingT)
                    .build();
        }



    }
