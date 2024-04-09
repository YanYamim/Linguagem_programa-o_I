package org.example.Macaco;

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

    public String getEspecie() {
        return especie;
    }

    public String getCor() {
        return cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public String getAlimentacao() {
        return alimentacao;
    }
}