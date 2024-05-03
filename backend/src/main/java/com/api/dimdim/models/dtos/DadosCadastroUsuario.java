package com.api.dimdim.models.dtos;

import java.sql.Date;

import com.api.dimdim.models.Endereco;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroUsuario(
@NotBlank
String nome,
@NotBlank
String cpf,
@NotBlank
String genero,
@NotNull
Date data_nascimento,
@Valid
Endereco endereco

) {

}
