package Pokemon;

public class PokemonController {
    private Pokemon pokemon;
    private PokemonView view;

    public PokemonController(Pokemon pokemon, PokemonView view) {
        this.pokemon = pokemon;
        this.view = view;
    }

    public void exibirPokemon() {
        view.imprimirPokemon(pokemon);
    }

    public void batalhar() {
        System.out.println("O " + pokemon.getNome() + " está batalhando");
    }

    public void evoluir() {
        System.out.println("O " + pokemon.getNome() + " está evoluindo");
    }

    public void reproduzir() {
        System.out.println("O " + pokemon.getNome() + " está se reproduzindo");
    }
}
