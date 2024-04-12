module org.example.arquiteturapokemon {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;


    opens org.example.arquiteturapokemon to javafx.fxml;
    exports org.example.arquiteturapokemon;
}