package com.moneyapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moneyapi.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

}
