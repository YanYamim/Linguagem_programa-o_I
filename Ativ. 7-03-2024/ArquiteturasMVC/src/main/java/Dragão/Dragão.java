package Dragão;

public class Dragão {
    private String especie;
    private String cor;
    private String tamanho;
    private String classe;

    public Dragão(String especie, String cor, String tamanho, String classe){
        this.especie = especie;
        this.cor = cor;
        this.tamanho = tamanho;
        this.classe = classe;
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

    public String getClasse() {
        return classe;
    }
}
