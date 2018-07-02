package com.cds.cdsfrontend.repositories;

import com.cds.cdsfrontend.models.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface ReservationRepository extends JpaRepository <Reservation, Long> {

    Collection <Reservation> findByReservationName(@Param("reservationName") String reservationName);
}
