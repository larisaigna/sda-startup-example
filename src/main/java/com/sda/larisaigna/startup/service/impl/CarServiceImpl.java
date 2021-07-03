package com.sda.larisaigna.startup.service.impl;

import com.sda.larisaigna.startup.model.car.Car;
import com.sda.larisaigna.startup.repository.CarRepository;
import com.sda.larisaigna.startup.service.CarService;
import com.sda.larisaigna.startup.service.dto.CarDTO;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class CarServiceImpl implements CarService {

    private final CarRepository carRepository;

    public CarServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    @Transactional
    public Long addCar(CarDTO carDTO) {
        Car car = convertToCar(carDTO);
        carRepository.save(car);
        return car.getId();
    }

    public Car convertToCar(CarDTO carDTO) {
        Car car = new Car();
        car.setBrand(carDTO.getBrand());
        car.setCarType((carDTO.getCarType()));
        car.setModel(carDTO.getModel());
        car.setProductDate(carDTO.getProductDate());
        car.setHp(carDTO.getHp());

        return car;
    }
}
