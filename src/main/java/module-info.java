module com.example.pruebapaneles {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.pruebapaneles to javafx.fxml;
    exports com.example.pruebapaneles;
}