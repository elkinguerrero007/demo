package com.example.demo.Repository.CrudRepository;

import com.example.demo.Model.Score;
import org.springframework.data.repository.CrudRepository;

public interface ScoreCrudRepository extends CrudRepository<Score, Integer> {
}
