package com.resturaunt;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("primary"), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {


        //ordering drink
        Drink drink1 = new Drink(true, false, "Coke", 3.00);
        System.out.println();
        System.out.println(drink1);

        //create Salad
        Salad salad1 = new Salad("Iceberg lettuce", "ranch", 6.34);
        
        System.out.println();
        System.out.println(salad1);

        //create Sandwhich
        Sandwhich sandwhich1 = new Sandwhich("sourdough", "salami", "tomatoes", "french fries", 11.55);

        System.out.println();
        System.out.println(sandwhich1);

        //tell total profits
        Bill Bill1 = new Bill(50, 9.50, 6.00, "Bob Ross");
        System.out.println();
        System.out.println(Bill1);
        
        launch();
    }

}