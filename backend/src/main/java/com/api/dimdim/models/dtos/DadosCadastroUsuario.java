package com.api.dimdim.models.dtos;

import jakarta.validation.constraints.NotBlank;

public record DadosCadastroUsuario(
@NotBlank
String nome,
@NotBlank
String cpf

) {

}
