package com.apap.tu05.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.apap.tu05.model.FlightModel;
import com.apap.tu05.model.PilotModel;

/**
 * FlightDb
 */
@Repository
public interface FlightDb extends JpaRepository<FlightModel, Long>{
	FlightModel findByPilotAndFlightNumber(PilotModel pilot, String flightNumber);
	void deleteByPilotAndFlightNumber(PilotModel pilot, String flightNumber);

}
