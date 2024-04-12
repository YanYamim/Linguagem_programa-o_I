package org.example.arquiteturadragao;

public class Dragao {
    private String especie;
    private String cor;
    private String tamanho;
    private String classe;

    public Dragao(String especie, String cor, String tamanho, String classe){
        this.especie = especie;
        this.cor = cor;
        this.tamanho = tamanho;
        this.classe = classe;
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

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }
}

