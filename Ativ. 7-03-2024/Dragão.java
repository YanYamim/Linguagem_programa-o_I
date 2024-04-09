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

    public void lutar() {
        System.out.println("O " + especie + "está lutando");
    }

    public void comer(){
        System.out.println("O " + especie + "está comendo");
    }

    public void reproduzir(){
        System.out.println("O " + especie + "está se reproduzindo");
    }

    public static void main(String[] args){
        Dragão dragao1 = new Dragão("Gronkel ", "Marrom", "Pequeno", "Rocha");
        dragao1.lutar();
        dragao1.comer();
        dragao1.reproduzir();

        Dragão dragao2 = new Dragão("Escalderível ", "Verde", "Grande", "Marinha");
        dragao2.lutar();
        dragao2.comer();
        dragao2.reproduzir();

        Dragão dragao3 = new Dragão("Fúria da Noite ", "Preto", "Médio", "Mistério");
        dragao3.lutar();
        dragao3.comer();
        dragao3.reproduzir();
    }
}
