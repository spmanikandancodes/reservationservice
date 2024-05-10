package com.example.Reservation.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "reservations")
public class ReservationEntity {

    @Id
            @Column(name = "ID")
    private Long id;

    @Column (name = "CUSTOMERID")
    private Long customerId;

    @Column (name = "HOTELID")
    private Long hotelId;

    @Column (name = "STARTDATE")
    private LocalDate startDate;

    @Column (name = "ENDDATE")
    private LocalDate endDate;
}
