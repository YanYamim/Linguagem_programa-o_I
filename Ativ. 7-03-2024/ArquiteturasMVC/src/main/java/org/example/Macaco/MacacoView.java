package org.example.Macaco;

import org.example.Macaco.Macaco;

public class MacacoView {
    public void imprimirMacaco(Macaco macaco) {
        System.out.println("Especie: " + macaco.getEspecie());
        System.out.println("Cor: " + macaco.getCor());
        System.out.println("Tamanho: " + macaco.getTamanho());
        System.out.println("Alimentação: " + macaco.getAlimentacao());
    }
}