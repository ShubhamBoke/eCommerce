package com.example.eshop;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Ecom extends Application {

    public BorderPane main_panel(){
        BorderPane root = new BorderPane();
        root.setPrefSize(850, 550);
        Main_window main_page = new Main_window();
        main_page.setMw_instance(main_page);
        root.setCenter(main_page.create());
        return root;
    }
    @Override
    public void start(Stage stage) throws IOException {
        Scene scene = new Scene(main_panel());
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}