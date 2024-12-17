module com.resturaunt {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.resturaunt to javafx.fxml;
    exports com.resturaunt;
}
