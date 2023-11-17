package com.pontointeligente.api.entities;

import java.io.Serializable;
import java.sql.Date;

import com.pontointeligente.api.enums.TipoEnum;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Data
@Entity
@Table(name = "lancamento")
public class Lancamento implements Serializable {
	private static final long serialVersionUID = 6524560251526772839L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "data", nullable = false)
	private Date data;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "data_criacao", nullable = false)
	private Date dataCriacao;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "data_atualizacao", nullable = false)
	private Date dataAtualizacao;

	@Column(name = "descricao", length = 255)
	private String descricao;

	@Column(name = "localizacao", length = 255)
	private String localizacao;

	@Column(name = "tipo", nullable = false, length = 255)
	private TipoEnum tipo;

	@ManyToOne
	@JoinColumn(name = "funcionario_id")
	private Funcionario funcionario;
}
