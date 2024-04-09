package org.example.Macaco;

public class MacacoController {
    private Macaco macaco;
    private MacacoView view;

    public MacacoController(Macaco macaco, MacacoView view) {
        this.macaco = macaco;
        this.view = view;
    }

    public void exibirMacaco() {
        view.imprimirMacaco(macaco);
    }

    public void comer() {
        System.out.println("O " + macaco.getEspecie() + " está comendo");
    }

    public void escalar() {
        System.out.println("O " + macaco.getEspecie() + " está escalando");
    }

    public void comunicar() {
        System.out.println("O " + macaco.getEspecie() + " está se comunicando");
    }
}