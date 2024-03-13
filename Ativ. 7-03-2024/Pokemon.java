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

    public void batalhar() {
        System.out.println("O " + nome + "está batalhando");
    }

    public void evoluir(){
        System.out.println("O " + nome + "está evoluindo");
    }

    public void reproduzir(){
        System.out.println("O " + nome + "está se reproduzindo");
    }

    public static void main(String[] args){
        Pokemon pokemon1 = new Pokemon("Scyther ", "Inseto", "Verde", "Floresta");
        pokemon1.batalhar();
        pokemon1.evoluir();
        pokemon1.reproduzir();

        Pokemon pokemon2 = new Pokemon("Eevee ", "Normal", "Marrom", "Floresta");
        pokemon2.batalhar();
        pokemon2.evoluir();
        pokemon2.reproduzir();

        Pokemon pokemon3 = new Pokemon("Gengar ", "Fantasma e Venenoso", "Preto", "Cemitérios");
        pokemon3.batalhar();
        pokemon3.evoluir();
        pokemon3.reproduzir();
    }
}
