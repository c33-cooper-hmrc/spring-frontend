package com.spring.springfrontend.repositories;

import com.spring.springfrontend.models.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface ReservationRepository extends JpaRepository <Reservation, Long> {

    Collection <Reservation> findByReservationName(@Param("reservationName") String reservationName);
}
