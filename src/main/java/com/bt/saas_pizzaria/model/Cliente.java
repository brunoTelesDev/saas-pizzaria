package com.bt.saas_pizzaria.model;

import jakarta.persistence.*;


@Entity
public class Cliente {
    @Id

    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String telefone;

    @Column(unique = true)
    private String email;

    public Long getId(){
        return id;
    }

    public String getNome(){
        return nome;
    }
    public String getEmail(){
        return email;
    }
    public String getTelefone(){
        return telefone;
    }

    public void setNome(String nome){
        this.nome= nome;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setTelefone (String telefone){
        this.telefone=telefone;
    }
}