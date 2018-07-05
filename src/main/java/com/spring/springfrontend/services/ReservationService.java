package com.spring.springfrontend.services;

import com.spring.springfrontend.models.Reservation;
import com.spring.springfrontend.repositories.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {

    // If we were talking to a backend or data-store service we would most
    // likely use constructor DI on a connector here to talk to our backend
    // or data-store service with further exception handling in here for
    // asynchronous connections, however our reservationsRepo is defined
    // here for this demo...

    // External field dependencies to be used in constructor DI.
    private final ReservationRepository reservationRepository;

    @Autowired
    public ReservationService(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    public List <Reservation> fetchReservations() {

        return this.reservationRepository.findAll();
    }
}
