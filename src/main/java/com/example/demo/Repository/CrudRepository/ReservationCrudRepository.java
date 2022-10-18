package com.example.demo.Repository.CrudRepository;


import com.example.demo.Model.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface ReservationCrudRepository extends CrudRepository<Reservation, Integer> {
}