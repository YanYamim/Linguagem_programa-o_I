package Dragão;

public class DragãoController {
    private Dragão dragão;
    private DragãoView view;

    public DragãoController(Dragão dragão, DragãoView view) {
        this.dragão = dragão;
        this.view = view;
    }

    public void exibirDragão() {
        view.imprimirDragão(dragão);
    }

    public void lutar() {
        System.out.println("O " + dragão.getEspecie() + " está lutando");
    }

    public void comer() {
        System.out.println("O " + dragão.getEspecie() + " está comendo");
    }

    public void reproduzir() {
        System.out.println("O " + dragão.getEspecie() + " está se reproduzindo");
    }
}
