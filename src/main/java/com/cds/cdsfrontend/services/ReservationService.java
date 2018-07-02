package com.cds.cdsfrontend.services;

import com.cds.cdsfrontend.models.Reservation;
import com.cds.cdsfrontend.repositories.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {

    // If we were talking to a backend or data-store service we would most
    // likely use constructor DI on a connector here to talk to our backend
    // or data-store service with further exception handling in here for
    // asynchronous handshakes, however our reservationsRepo is defined
    // here...

    // External field dependencies to be used in constructor DI.
    private ReservationRepository reservationRepository;

    @Autowired
    public ReservationService(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    public List<Reservation> fetchReservations() {
        return this.reservationRepository.findAll();
    }
}
