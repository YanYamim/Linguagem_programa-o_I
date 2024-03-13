public class Aliens {
    private String especie;
    private String cor;
    private String tamanho;
    private String natureza;

    public Aliens(String especie, String cor, String tamanho, String natureza){
        this.especie = especie;
        this.cor = cor;
        this.tamanho = tamanho;
        this.natureza = natureza;
    }

    public void lutar() {
        System.out.println("A " + especie + "está lutando");
    }

    public void sobreviver(){
        System.out.println("A " + especie + "está sobrevivendo");
    }

    public void reproduzir(){
        System.out.println("A " + especie + "está se reproduzindo");
    }

    public static void main(String[] args){
        Aliens alien1 = new Aliens("Pironita ", "Amarela", "Média", "Agressiva");
        alien1.lutar();
        alien1.sobreviver();
        alien1.reproduzir();

        Aliens alien2 = new Aliens("Nicrofrigiano ", "azul", "Médio", "Agressiva");
        alien2.lutar();
        alien2.sobreviver();
        alien2.reproduzir();

        Aliens alien3 = new Aliens("Sapien-Celestial ", "Preto", "indeterminado", "Pacífico");
        alien3.lutar();
        alien3.sobreviver();
        alien3.reproduzir();
    }
}
