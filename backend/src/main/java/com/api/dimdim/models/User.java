    package com.api.dimdim.models;

    import java.sql.Date;

    import com.api.dimdim.models.dtos.DadosCadastroUsuario;

    import jakarta.persistence.Column;
    import jakarta.persistence.Entity;
    import jakarta.persistence.GeneratedValue;
    import jakarta.persistence.GenerationType;
    import jakarta.persistence.Id;
    import jakarta.persistence.Table;
    import lombok.Getter;
    import lombok.Setter;


    @Getter
    @Setter
    @Entity
    @Table(name = "pf_user")
    public class User {
        
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long id; 
        @Column(name = "name")
        private String nome;
        @Column(name = "cpf")
        private String cpf;
        @Column(name = "genero")
        private String genero;
        @Column(name = "data_nascimento")
        private Date dataNascimento;
        @Column(name = "id_endereco")
        private long id_endereco;
        public User() {
        }
        public User(DadosCadastroUsuario dados){
            this.cpf = dados.cpf();
            this.nome = dados.nome();
        }
    }
