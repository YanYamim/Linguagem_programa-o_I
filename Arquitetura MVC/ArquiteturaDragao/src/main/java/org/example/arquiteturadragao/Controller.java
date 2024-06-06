package org.example.arquiteturadragao;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

public class Controller {
    @FXML
    private TextField especieTextField;

    @FXML
    private TextField corTextField;

    @FXML
    private TextField tamanhoTextField;

    @FXML
    private TextField classeTextField;

    @FXML
    private Text fraseText;

    @FXML
    private Label fraseLabel;

    @FXML
    private ImageView imageView;

    private Dragao dragao;

    @FXML
    private void gerarFrase(ActionEvent event) {
        String especie = especieTextField.getText();
        String cor = corTextField.getText();
        String tamanho = tamanhoTextField.getText();
        String classe = classeTextField.getText();

        String frase = "O " + especie + " é um dragão da cor " + cor + ", de porte " + tamanho + " e da classe " + classe;
        fraseLabel.setText(frase);

        Image imagem = new Image(getClass().getResourceAsStream("/856fed7afbae20ab6dde6ab87f8305de.jpg"));
        imageView.setImage(imagem);
    }
}


