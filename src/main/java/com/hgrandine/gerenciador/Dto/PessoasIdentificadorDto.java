package com.hgrandine.gerenciador.Dto;

public class PessoasIdentificadorDto {
    
    private String nome;
    private String identificador;
    private String tipoIdentificador;
    
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
