package Dragão;

public class DragãoView {
    public void imprimirDragão(Dragão dragão) {
        System.out.println("Espécie: " + dragão.getEspecie());
        System.out.println("Cor: " + dragão.getCor());
        System.out.println("Tamanho: " + dragão.getTamanho());
        System.out.println("Classe: " + dragão.getClasse());
    }
}
