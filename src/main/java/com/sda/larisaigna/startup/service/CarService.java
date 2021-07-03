package com.sda.larisaigna.startup.service;

import com.sda.larisaigna.startup.service.dto.CarDTO;

public interface CarService {

    /**
     * Create a new car for the given carDTO.
     * @param carDTO, details of the new car
     * @return the id of the new created car
     */
    Long addCar (CarDTO carDTO);
}
