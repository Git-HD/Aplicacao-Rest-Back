package com.moneyapi.repository.lancamento;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.moneyapi.model.Lancamento;
import com.moneyapi.repository.filter.LancamentoFilter;
import com.moneyapi.repository.projection.ResumoLancamento;

public interface LancamentoRepositoryQuery {

	public Page<Lancamento> filtrar(LancamentoFilter lancamentoFilter, Pageable pageable);
	public Page<ResumoLancamento> resumir(LancamentoFilter lancamentoFilter, Pageable pageable);
	
}
