public class Carro {
    private String modelo;
    private String cor;
    private String tamanho;
    private String marca;

    public Carro(String modelo, String cor, String tamanho, String marca){
        this.modelo = modelo;
        this.cor = cor;
        this.tamanho = tamanho;
        this.marca = marca;
    }

    public void andar() {
        System.out.println("Esse " + marca + modelo + "está andando");
    }

    public void freiar(){
        System.out.println("Esse " + marca + modelo + "está freiando");
    }

    public void buzinar(){
        System.out.println("Esse " + marca + modelo + "está buzinando");
    }

    public static void main(String[] args){
        Carro carro1 = new Carro("Voyaje ", "Preto", "médio", "chevrolet");
        carro1.andar();
        carro1.freiar();
        carro1.buzinar();

        Carro carro2 = new Carro("TT ", "Branco", "grande", "Audi");
        carro2.andar();
        carro2.freiar();
        carro2.buzinar();

        Carro carro3 = new Carro("Uno ", "Preto", "pequeno", "Fiat");
        carro3.andar();
        carro3.freiar();
        carro3.buzinar();
    }
}

