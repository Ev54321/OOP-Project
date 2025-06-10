package com.resturaunt;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;


public class PrimaryController {

    @FXML
    private ImageView logoimage;

    @FXML
    Button addSodaButton = new Button();

    @FXML
    Button addWaterButton = new Button();

    @FXML
    Button addBurgerButton = new Button();

    @FXML
    Button addSaladButton = new Button();

    @FXML
    Button addSandwichButton = new Button();

    @FXML
    Button addSpaghettiButton = new Button();

    @FXML
    Button payButton = new Button();

    @FXML
    TextField seedText = new TextField();

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
