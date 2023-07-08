package com.testproject.swp.service;

import java.util.List;
import java.util.Map;

import com.testproject.swp.exception.custom.CustomNotFoundEx;
import com.testproject.swp.model.Reservation.dto.ReservationCreateDTO;
import com.testproject.swp.model.Reservation.dto.ReservationResponseDTO;
import com.testproject.swp.model.Reservation.dto.ReservationsDTO;

public interface ReservationService {

    List<ReservationsDTO> getAllReservations();

    ReservationsDTO getReservationById(int id) throws CustomNotFoundEx;

    Map<String, ReservationResponseDTO> addReservation(Map<String, ReservationCreateDTO> reservationCreateDTOMap);

}
