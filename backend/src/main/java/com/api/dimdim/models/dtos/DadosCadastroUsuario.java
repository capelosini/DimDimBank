package com.api.dimdim.models.dtos;

import java.sql.Date;




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
@NotBlank
String endereco

) {

}
