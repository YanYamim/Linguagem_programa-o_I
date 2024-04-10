package org.example.Macaco;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class MacacoController {

    @FXML
    private Button BTMsubmeter;

    @FXML
    private TextField corM;

    @FXML
    private TextField especieM;

    @FXML
    private TextField alimentacaoM;

    @FXML
    private ImageView imgM;

    @FXML
    private Tab nomeP;

    @FXML
    private TextField tamanhoM;

    @FXML
    void SubmeterM(ActionEvent event) {
        String especie = especieM.getText();
        String tamanho = tamanhoM.getText();
        String cor = corM.getText();
        String alimentacao = alimentacaoM.getText();

        Macaco macaco = new Macaco(especie, tamanho, cor, alimentacao);

        String fraseM = "O Macaco da espécie" + macaco.getEspecie() + " de " + macaco.getTamanho() + " porte " + " de cor " +
                macaco.getCor() + " tem uma dieta " + macaco.getAlimentacao();

        System.out.println(fraseM);

        Image imagens = new Image("Primates_-_some_families.jpg");
        imgM.setImage(imagens);
    }

}