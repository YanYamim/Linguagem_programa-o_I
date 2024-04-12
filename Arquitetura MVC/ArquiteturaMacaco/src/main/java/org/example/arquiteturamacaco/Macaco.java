package org.example.arquiteturamacaco;

public class Macaco {
    private String especie;
    private String cor;
    private String tamanho;
    private String alimentacao;

    public Macaco(String especie, String cor, String tamanho, String alimentacao){
        this.especie = especie;
        this.cor = cor;
        this.tamanho = tamanho;
        this.alimentacao = alimentacao;
    }

    // Getters e Setters
    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getAlimentacao() {
        return alimentacao;
    }

    public void setAlimentacao(String alimentacao) {
        this.alimentacao = alimentacao;
    }
}
