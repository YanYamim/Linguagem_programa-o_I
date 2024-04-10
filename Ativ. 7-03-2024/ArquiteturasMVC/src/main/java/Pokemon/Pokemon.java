package Pokemon;

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

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public String getCor() {
        return cor;
    }

    public String getHabitat() {
        return habitat;
    }
}
