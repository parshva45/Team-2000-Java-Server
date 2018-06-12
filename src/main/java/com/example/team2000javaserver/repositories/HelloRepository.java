package com.example.team2000javaserver.repositories;

import org.springframework.data.repository.CrudRepository;
import com.example.team2000javaserver.model.Hello;

public interface HelloRepository
extends CrudRepository<Hello, Integer> {}

