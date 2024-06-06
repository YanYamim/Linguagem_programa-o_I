package org.example.arquiteturapokemon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DatabasePokedex {

    // Método para obter a conexão com o banco de dados
    public static Connection getConnection() throws SQLException {
        try {
            // Retorna uma conexão com o banco de dados
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/pokemons", "root", "1234");
        } catch (SQLException exception) {
            // Lança uma exceção se ocorrer um erro na conexão
            throw new RuntimeException(exception);
        }
    }

    // Método para inserir dados na tabela Pokedex
    public static void inserirDadosPokedex(String nome, String tipo, String cor, String habitat) throws SQLException {
        String insertPokedex = "INSERT INTO pokemons (Nome, Tipo, Cor, Habitat) VALUES (?, ?, ?, ?)";

        // Bloco try-with-resources para garantir que a conexão e o PreparedStatement sejam fechados corretamente
        try (Connection connection = getConnection();
             PreparedStatement pokedexStmt = connection.prepareStatement(insertPokedex)) {

            // Configura os parâmetros do PreparedStatement
            pokedexStmt.setString(1, nome);
            pokedexStmt.setString(2, tipo);
            pokedexStmt.setString(3, cor);
            pokedexStmt.setString(4, habitat);

            // Executa a inserção no banco de dados
            pokedexStmt.executeUpdate();

            // Mensagem de sucesso
            System.out.println("Dados inseridos com sucesso");

        } catch (SQLException e) {
            // Captura e imprime qualquer exceção SQL
            e.printStackTrace();
        }
    }
}
