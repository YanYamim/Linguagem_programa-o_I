package org.example.arquiteturapokemon;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

import java.sql.SQLException;

public class Controller {
    @FXML
    private TextField nomeTextField;

    @FXML
    private TextField tipoTextField;

    @FXML
    private TextField corTextField;

    @FXML
    private TextField habitatTextField;

    @FXML
    private Text fraseText;

    @FXML
    private Label fraseLabel;

    @FXML
    private ImageView imageView;

    private Pokemon pokemon;

    @FXML
    private void gerarFrase(ActionEvent event) throws SQLException {
        String nome = nomeTextField.getText();
        String tipo = tipoTextField.getText();
        String cor = corTextField.getText();
        String habitat = habitatTextField.getText();

        String frase = "O " + nome + " é um pokémon do tipo " + tipo + ", de cor " + cor + " e vive em " + habitat;
        fraseLabel.setText(frase);

        Image imagem = new Image(getClass().getResourceAsStream("/oras-y-x-pacote-com-todos-os-42-pokemon-de-ash-ketchum-6iv-D_NQ_NP_22808-MLB20236366373_012015-F.jpg"));
        imageView.setImage(imagem);


        try {
            // Insere os dados no banco de dados
            DatabasePokedex.inserirDadosPokedex(nome, tipo, cor, habitat);
        } catch (SQLException e) {
            // Tratar qualquer exceção de SQL
            e.printStackTrace();
        }
    }
}

