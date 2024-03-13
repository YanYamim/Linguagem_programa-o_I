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

    public void comer() {
        System.out.println("O " + especie + "está comendo");
    }

    public void escalar(){
        System.out.println("O " + especie + "está escalando");
    }

    public void comunicar(){
        System.out.println("O " + especie + "está se comunicando");
    }

    public static void main(String[] args){
        Macaco macaco1 = new Macaco("Sagui ", "Preto", "Pequeno", "Onívoro");
        macaco1.comer();
        macaco1.escalar();
        macaco1.comunicar();

        Macaco macaco2 = new Macaco("Lêmure ", "Branco", "Médio", "Herbívoro");
        macaco2.comer();
        macaco2.escalar();
        macaco2.comunicar();

        Macaco macaco3 = new Macaco("Chimpanzé ", "Preto", "Médio", "Carnívoro");
        macaco3.comer();
        macaco3.escalar();
        macaco3.comunicar();
    }
}
