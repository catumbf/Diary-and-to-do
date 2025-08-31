module com.example.todoanddiary {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.todoanddiary to javafx.fxml;
    exports com.example.todoanddiary;
}