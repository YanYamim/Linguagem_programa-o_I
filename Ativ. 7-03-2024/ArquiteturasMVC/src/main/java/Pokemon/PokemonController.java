package Pokemon;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class PokemonController{

    @FXML
    private Button BTPsubmeter;

    @FXML
    private TextField corP;

    @FXML
    private TextField habitatP;

    @FXML
    private ImageView imgP;

    @FXML
    private Tab nomeP;

    @FXML
    private TextField tipoP;

    @FXML
    void SubmeterP(ActionEvent event) {
        String nome = nomeP.getText();
        String tipo = tipoP.getText();
        String cor = corP.getText();
        String habitat = habitatP.getText();

        Pokemon pokemon = new Pokemon(nome, tipo, cor, habitat);

        String fraseP = "O Pokemon " + pokemon.getNome() + " do tipo " + pokemon.getTipo() + " de cor " +
                pokemon.getCor() + " vive em " + pokemon.getHabitat();

        System.out.println(fraseP);

        Image imagens = new Image("Pokémon-que-Ash-Ketchum-já-capturou-capa.jpg");
        imgP.setImage(imagens);
    }

}
