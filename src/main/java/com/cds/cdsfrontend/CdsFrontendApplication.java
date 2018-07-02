package com.cds.cdsfrontend;

import com.cds.cdsfrontend.models.Reservation;
import com.cds.cdsfrontend.repositories.ReservationRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class CdsFrontendApplication {

	public static void main(String[] args) {
		SpringApplication.run(CdsFrontendApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(ReservationRepository reservationRepository) {
		return (args) -> {

				Arrays.asList("Callum,Steve,Joe,Jack,Lucy,Emily".split(","))
						.forEach(reservation -> reservationRepository.save(new Reservation(reservation)));

				reservationRepository.findAll().forEach( System.out::println );
			};
		}
}


