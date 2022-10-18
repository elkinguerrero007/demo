package com.example.demo.Repository.CrudRepository;


import com.example.demo.Model.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientCrudRepository extends CrudRepository<Client, Integer> {
}