package com.pontointeligente.api.repositories;

import java.util.List;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.pontointeligente.api.entities.Lancamento;

import org.springframework.stereotype.Repository;

@Repository
@Transactional(readOnly = true)
@jakarta.persistence.NamedQueries({
		@jakarta.persistence.NamedQuery(name = "LancamentoRepository.findByFuncionarioId", query = "SELECT lanc FROM Lancamento lanc WHERE lanc.funcionario.id = :funcionarioId") })
public interface LancamentoRepository extends JpaRepository<Lancamento, Long> {

	List<Lancamento> findByFuncionarioId(@Param("funcionarioId") Long funcionarioId);

	Page<Lancamento> findByFuncionarioId(@Param("funcionarioId") Long funcionarioId, Pageable pageable);
}
