package com.example.demo.Repository.CrudRepository;

import com.example.demo.Model.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageCrudRepository extends CrudRepository<Message, Integer> {
}
