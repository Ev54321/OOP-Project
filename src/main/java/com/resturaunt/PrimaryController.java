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
    private void displayInput() throws IOException
    {
        String output = "You added a soda to your order.";

        System.out.println(output);
    }

    @FXML
    Button addWaterButton = new Button();

    @FXML
    private void displayInput2() throws IOException
    {
        String output = "You added a water to your order.";

        System.out.println(output);
    }

    @FXML
    Button addBurgerButton = new Button();

    @FXML
    private void displayInput3() throws IOException
    {
        String output = "You added a burger to your order.";

        System.out.println(output);
    }

    @FXML
    Button addSaladButton = new Button();

    @FXML
    private void displayInput4() throws IOException
    {
        String output = "You added a salad to your order.";

        System.out.println(output);
    }

    @FXML
    Button addSandwichButton = new Button();

    @FXML
    private void displayInput5() throws IOException
    {
        String output = "You added a sandwich to your order.";

        System.out.println(output);
    }

    @FXML
    Button addSpaghettiButton = new Button();

    @FXML
    private void displayInput6() throws IOException
    {
        String output = "You added a spaghetti to your order.";

        System.out.println(output);
    }

    @FXML
    Button payButton = new Button();

    @FXML
    TextField seedText = new TextField();

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("Continue");
    }
}
