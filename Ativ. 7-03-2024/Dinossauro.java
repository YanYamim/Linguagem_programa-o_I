public class Dinossauro {
    private String especie;
    private String habitat;
    private String tamanho;
    private String alimentacao;

    public Dinossauro(String especie, String habitat, String tamanho, String alimentacao){
        this.especie = especie;
        this.habitat = habitat;
        this.tamanho = tamanho;
        this.alimentacao = alimentacao;
    }

    public void comer() {
        System.out.println("O " + especie + "está comendo");
    }

    public void sobreviver(){
        System.out.println("O " + especie + "está sobrevivendo");
    }

    public void reproduzir(){
        System.out.println("O " + especie + "está se reproduzindo");
    }

    public static void main(String[] args){
        Dinossauro dinossauro1 = new Dinossauro("Triceratops ", "Terra", "Grande", "Herbívoro");
        dinossauro1.comer();
        dinossauro1.sobreviver();
        dinossauro1.reproduzir();

        Dinossauro dinossauro2 = new Dinossauro("Spinossauro ", "Terra", "Grande", "Carnívoro");
        dinossauro2.comer();
        dinossauro2.sobreviver();
        dinossauro2.reproduzir();

        Dinossauro dinossauro3 = new Dinossauro("Pterodactl ", "Céu", "Pequeno", "Carnívoro");
        dinossauro3.comer();
        dinossauro3.sobreviver();
        dinossauro3.reproduzir();
    }
}
