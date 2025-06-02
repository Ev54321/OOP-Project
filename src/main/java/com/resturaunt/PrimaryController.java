package com.resturaunt;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class PrimaryController {
    ImageView logoImage = new ImageView();
    Button addSodaButton = new Button();
    Button addWaterButton = new Button();
    Button addBurgerButton = new Button();
    Button addSaladButton = new Button();
    Button addSandwichButton = new Button();
    Button addSpaghettiButton = new Button();
    Button payButton = new Button();
    TextField seedText = new TextField();

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
