module com.example.event_listener {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.event_listener to javafx.fxml;
    exports com.example.event_listener;
}