package org.example.arquiteturapokemon;

public class Pokemon {
    private String nome;
    private String tipo;
    private String cor;
    private String habitat;

    public Pokemon(String nome, String tipo, String cor, String habitat){
        this.nome = nome;
        this.tipo = tipo;
        this.cor = cor;
        this.habitat = habitat;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
}

