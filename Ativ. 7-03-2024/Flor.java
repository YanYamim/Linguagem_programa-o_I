public class Flor {
    private String especie;
    private String cor;
    private String tamanho;
    private String tipo;

    public Flor(String especie, String cor, String tamanho, String tipo){
        this.especie = especie;
        this.cor = cor;
        this.tamanho = tamanho;
        this.tipo = tipo;
    }

    public void ploriferar() {
        System.out.println("A " + especie + "está ploriferando");
    }

    public void fotossintetizar(){
        System.out.println("A " + especie + "está fotossíntetizando");
    }

    public void reproduzir(){
        System.out.println("A " + especie + "está se reproduzindo");
    }

    public static void main(String[] args){
        Flor flor1 = new Flor("Bananeira ", "verde", "média", "angiosperma");
        flor1.ploriferar();
        flor1.fotossintetizar();
        flor1.reproduzir();

        Flor flor2 = new Flor("Ipê ", "amarela", "grande", "angiosperma");
        flor2.ploriferar();
        flor2.fotossintetizar();
        flor2.reproduzir();

        Flor flor3 = new Flor("Margarida ", "branca", "pequena", "angiosperma");
        flor3.ploriferar();
        flor3.fotossintetizar();
        flor3.reproduzir();
    }
}
