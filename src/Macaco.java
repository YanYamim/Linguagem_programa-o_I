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

        Macaco macaco4 = new Macaco("Orangotango ", "Laranja", "Médio", "Onívoro");
        macaco4.comer();
        macaco4.escalar();
        macaco4.comunicar();

        Macaco macaco5 = new Macaco("Macaco-Aranha ", "Preto", "Médio", "Onívoro");
        macaco5.comer();
        macaco5.escalar();
        macaco5.comunicar();

        Macaco macaco6 = new Macaco("Macaco-Prego ", "Marrom", "Pequeno", "Onívoro");
        macaco6.comer();
        macaco6.escalar();
        macaco6.comunicar();

        Macaco macaco7 = new Macaco("Bugio ", "Marrom ou Preto", "Pequeno", "Onívoro");
        macaco7.comer();
        macaco7.escalar();
        macaco7.comunicar();

        Macaco macaco8 = new Macaco("Gorila ", "Preto", "Grande", "Herbívoro");
        macaco8.comer();
        macaco8.escalar();
        macaco8.comunicar();

        Macaco macaco9 = new Macaco("Babuíno ", "Branco ou Marrom", "Médio", "Onívoro");
        macaco9.comer();
        macaco9.escalar();
        macaco9.comunicar();

        Macaco macaco10 = new Macaco("Mico-Leão-Dourado ", "Laranja ou Preto", "Pequeno", "Onívoro");
        macaco10.comer();
        macaco10.escalar();
        macaco10.comunicar();
    }
}
