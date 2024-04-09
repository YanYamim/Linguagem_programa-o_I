package Dragão;

public class MainDragão {
    public static void main(String[] args) {
        Dragão dragão1 = new Dragão("Gronkel", "Marrom", "Pequeno", "Rocha");
        DragãoView view = new DragãoView();
        DragãoController controller = new DragãoController(dragão1, view);

        controller.exibirDragão();
        controller.lutar();
        controller.comer();
        controller.reproduzir();
    }
}
