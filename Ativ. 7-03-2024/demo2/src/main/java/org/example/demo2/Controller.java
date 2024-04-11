package org.example.demo2;

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
    private TextField alimentacaoTextField;

    @FXML
    private Text fraseText;

    @FXML
    private Label fraseLabel;

    @FXML
    private ImageView imageView;

    private Macaco macaco;

    @FXML
    private void gerarFrase(ActionEvent event) {
        String especie = especieTextField.getText();
        String cor = corTextField.getText();
        String tamanho = tamanhoTextField.getText();
        String alimentacao = alimentacaoTextField.getText();

        String frase = "O " + especie + " é " + cor + ", tem porte " + tamanho + " e é " + alimentacao;
        fraseLabel.setText(frase);

        Image imagem = new Image(getClass().getResourceAsStream("/Primates_-_some_families.jpg"));
        imageView.setImage(imagem);
    }
}
