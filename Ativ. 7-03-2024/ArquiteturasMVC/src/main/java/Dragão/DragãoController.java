package Dragão;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class DragãoController {

    @FXML
    private Button BTMsubmeter;

    @FXML
    private TextField classeD;

    @FXML
    private TextField corD;

    @FXML
    private TextField especieD;

    @FXML
    private ImageView imgD;

    @FXML
    private Tab nomeP;

    @FXML
    private TextField tamanhoD;

    @FXML
    void SubmeterD(ActionEvent event) {
        String especie = especieD.getText();
        String tamanho = tamanhoD.getText();
        String cor = corD.getText();
        String classe = classeD.getText();

        Dragão dragão = new Dragão(especie, tamanho, cor, classe);

        String fraseD = "O dragão da espécie" + dragão.getEspecie() + " de " + dragão.getTamanho() + " porte " + " de cor " +
                dragão.getCor() + " e da classe " + dragão.getClasse();

        System.out.println(fraseD);

        Image imagens = new Image("856fed7afbae20ab6dde6ab87f8305de.jpg");
        imgD.setImage(imagens);
    }
}
