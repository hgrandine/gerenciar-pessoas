package com.hgrandine.gerenciador.Domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class Pessoa implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String identificador;
    private String tipoIdentificador;
    private String senha;
    private int notaNumericaSenha;
    private String notaSenha;

    public int getNotaNumericaSenha() {
        return notaNumericaSenha;
    }

    public void setNotaNumericaSenha(int notaNumericaSenha) {
        this.notaNumericaSenha = notaNumericaSenha;
    }

    public String getNotaSenha() {
        return notaSenha;
    }

    public void setNotaSenha(String notaSenha) {
        this.notaSenha = notaSenha;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getTipoIdentificador() {
        return tipoIdentificador;
    }

    public void setTipoIdentificador(String tipoIdentificador) {
        this.tipoIdentificador = tipoIdentificador;
    }
}
