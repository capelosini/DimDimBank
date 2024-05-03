    package com.api.dimdim.models;

    import java.sql.Date;



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
    @Table(name = "users")
    public class User {
        
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long id; 
        @Column(name = "name", nullable = false)
        private String nome;
        @Column(name = "cpf", nullable = false)
        private String cpf;
        @Column(name = "genero", nullable = false)
        private String genero;
        @Column(name = "data_nascimento", nullable = false)
        private Date dataNascimento;
        @Column(name = "cep", nullable = false)
        private String cep;
        @Column(name = "tipo", nullable = false)
        private String tipoUsuario;
        

        public User() {
            super();
        }

    }
