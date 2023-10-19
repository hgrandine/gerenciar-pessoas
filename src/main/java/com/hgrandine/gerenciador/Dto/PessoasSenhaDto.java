package com.hgrandine.gerenciador.Dto;

public class PessoasSenhaDto {
    private String nome;
    private int notaNumericaSenha;
    private String notaSenha;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

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
}
