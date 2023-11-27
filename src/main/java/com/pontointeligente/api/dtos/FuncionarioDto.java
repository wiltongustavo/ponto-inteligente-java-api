package com.pontointeligente.api.dtos;

import java.util.Optional;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
public class FuncionarioDto {
	 private Long id;

	    @NotBlank(message = "Nome não pode ser vazio.")
	    @Length(min = 3, max = 200, message = "Nome deve conter entre 3 e 200 caracteres.")
	    private String nome;

	    @NotBlank(message = "Email não pode ser vazio.")
	    @Length(min = 5, max = 200, message = "Email deve conter entre 5 e 200 caracteres.")
	    @Email(message="Email inválido.")
	    private String email;

	    private Optional<String> senha = Optional.empty();

	    private Optional<String> valorHora = Optional.empty();

	    private Optional<String> qtdHorasTrabalhoDia = Optional.empty();

	    private Optional<String> qtdHorasAlmoco = Optional.empty();

}
