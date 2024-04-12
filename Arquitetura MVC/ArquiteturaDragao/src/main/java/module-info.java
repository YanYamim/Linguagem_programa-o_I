module org.example.arquiteturadragao {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.arquiteturadragao to javafx.fxml;
    exports org.example.arquiteturadragao;
}