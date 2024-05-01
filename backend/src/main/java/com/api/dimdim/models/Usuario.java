package com.api.dimdim.models;


import com.api.dimdim.models.dtos.DadosCadastroUsuario;

import lombok.Getter;
import lombok.Setter;

public class Usuario {
    
    private @Getter @Setter String nome;
    private @Getter @Setter String Cpf;
    private @Getter @Setter String Cnpj;
    private @Getter @Setter Conta conta;
    

    public Usuario(DadosCadastroUsuario dados){
        this.Cpf = dados.cpf();
        this.nome = dados.nome();
    }
}
