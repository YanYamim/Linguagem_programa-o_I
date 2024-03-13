public class Beyblade {
    private String nome;
    private String tipo;
    private String cor;
    private String modelo;

    public Beyblade(String nome, String tipo, String cor, String modelo){
        this.nome = nome;
        this.tipo = tipo;
        this.cor = cor;
        this.modelo = modelo;
    }

    public void batalhar() {
        System.out.println("O " + nome + "está batalhando");
    }

    public void treinar(){
        System.out.println("O " + nome + "está treinando");
    }

    public void vencer(){
        System.out.println("O " + nome + "está se vencendo");
    }

    public static void main(String[] args){
        Beyblade beyblade1 = new Beyblade("Horozeus ", "Defesa", "Dourado", "T5J3S");
        beyblade1.batalhar();
        beyblade1.treinar();
        beyblade1.vencer();

        Beyblade beyblade2 = new Beyblade("Pegasus ", "Ataque", "Azul", "S9F43");
        beyblade2.batalhar();
        beyblade2.treinar();
        beyblade2.vencer();

        Beyblade beyblade3 = new Beyblade("Libra ", "Equilíbrio", "Verde", "J7PF2");
        beyblade3.batalhar();
        beyblade3.treinar();
        beyblade3.vencer();
    }
}
