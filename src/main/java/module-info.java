module com.mutsa.backend.javaproject2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.mutsa.backend.javaproject2 to javafx.fxml;
    exports com.mutsa.backend.javaproject2;
}