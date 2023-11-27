package com.pontointeligente.api.dtos;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
public class EmpresaDto {
	private Long id;
	private String razaoSocial;
	private String cnpj;
}
