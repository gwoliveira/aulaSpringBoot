package com.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.domain.Dados;

public interface DadosRepository extends CrudRepository<Dados, Integer>{

}
