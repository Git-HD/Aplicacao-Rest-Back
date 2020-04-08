package com.moneyapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moneyapi.model.Lancamento;
import com.moneyapi.repository.lancamento.LancamentoRepositoryQuery;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>, LancamentoRepositoryQuery {

}
