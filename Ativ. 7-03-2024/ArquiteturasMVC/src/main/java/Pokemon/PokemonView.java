package Pokemon;

public class PokemonView {
    public void imprimirPokemon(Pokemon pokemon) {
        System.out.println("Nome: " + pokemon.getNome());
        System.out.println("Tipo: " + pokemon.getTipo());
        System.out.println("Cor: " + pokemon.getCor());
        System.out.println("Habitat: " + pokemon.getHabitat());
    }
}