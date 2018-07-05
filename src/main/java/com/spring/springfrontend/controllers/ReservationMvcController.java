package com.spring.springfrontend.controllers;

import com.spring.springfrontend.services.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ReservationMvcController {

    // External field dependencies to be used in constructor DI.
    private final ReservationService reservationService;

    @Autowired
    public ReservationMvcController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @RequestMapping(value = "/reservations/template", method = RequestMethod.GET)
    String reservations (Model model) {
        model.addAttribute("reservations", this.reservationService.fetchReservations());

        return "reservations"; // src/main/resources/templates/ + $X + .html
    }
}
