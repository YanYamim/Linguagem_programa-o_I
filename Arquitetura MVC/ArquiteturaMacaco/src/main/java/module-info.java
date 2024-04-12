module org.example.arquiteturamacaco {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.arquiteturamacaco to javafx.fxml;
    exports org.example.arquiteturamacaco;
}