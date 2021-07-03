package com.sda.larisaigna.startup.repository;

import com.sda.larisaigna.startup.model.car.Car;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends CrudRepository<Car, Long> {
}
