package Pokemon;

public class MainPokemon {
    public static void main(String[] args) {
        Pokemon pokemon1 = new Pokemon("Scyther", "Inseto", "Verde", "Floresta");
        PokemonView view = new PokemonView();
        PokemonController controller = new PokemonController(pokemon1, view);

        controller.exibirPokemon();
        controller.batalhar();
        controller.evoluir();
        controller.reproduzir();
    }
}
