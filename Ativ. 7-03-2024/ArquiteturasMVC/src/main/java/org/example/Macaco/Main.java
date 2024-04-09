package org.example.Macaco;

public class Main {
    public static void main(String[] args) {
        Macaco macaco1 = new Macaco("Sagui", "Preto", "Pequeno", "Onívoro");
        MacacoView view = new MacacoView();
        MacacoController controller = new MacacoController(macaco1, view);

        controller.exibirMacaco();
        controller.comer();
        controller.escalar();
        controller.comunicar();
    }
}