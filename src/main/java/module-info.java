module com.resturaunt {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    opens com.resturaunt to javafx.fxml;
    exports com.resturaunt;
}
