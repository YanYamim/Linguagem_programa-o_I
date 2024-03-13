public class Inseto {
    private String especie;
    private String cor;
    private String tamanho;
    private String alimentacao;

    public Inseto(String especie, String cor, String tamanho, String alimentacao){
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

    public void reproduzir(){
        System.out.println("O " + especie + "está se reproduzindo");
    }

    public static void main(String[] args){
        Inseto inseto1 = new Inseto("Besouro-Golias ", "Preto", "Grande", "herbívoro");
        inseto1.comer();
        inseto1.escalar();
        inseto1.reproduzir();

        Inseto inseto2 = new Inseto("Louva-Deus ", "Verde", "Médio", "Herbívoro");
        inseto2.comer();
        inseto2.escalar();
        inseto2.reproduzir();

        Inseto inseto3 = new Inseto("Mosca ", "Preto", "Pequeno", "Onívoro");
        inseto3.comer();
        inseto3.escalar();
        inseto3.reproduzir();
    }
}
