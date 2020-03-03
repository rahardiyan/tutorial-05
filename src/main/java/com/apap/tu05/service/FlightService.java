package com.apap.tu05.service;

import java.util.List;

import com.apap.tu05.model.FlightModel;
import com.apap.tu05.model.PilotModel;

/**
 * FlightService
 * @author Ainun
 *
 */
public interface FlightService {
	void addFlight(FlightModel flight);
	List<FlightModel> getAllFlight();
	FlightModel getFlight(PilotModel pilot, String flightNumber);
	void deleteFlight(PilotModel pilot, String flightNumber);
	void updateFlight(FlightModel flight);
	void deleteFlightById(long id);
}
