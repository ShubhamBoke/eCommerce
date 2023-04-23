package com.example.eshop;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

public class Main_window {
    BorderPane root = new BorderPane();
    Home_page homePageInstance = new Home_page();
    GridPane homePage;
    Login_page loginPageInstance = new Login_page();
    GridPane loginPage;
    boolean isLoggedIn = false;
    User logged_user;
    Main_window mw_instance;
    public void setMw_instance(Main_window mw_instance){
        this.mw_instance = mw_instance;
    }
    public BorderPane create(){
        homePage = homePageInstance.create(mw_instance);
        loginPage = loginPageInstance.create(mw_instance);
        root.setCenter(homePage);
        return root;
    }

    public void setLogin_Page(){
        root.getChildren().clear();
        root.setCenter(loginPage);
    }

    public void setHome_Page(){
        root.getChildren().clear();
        root.setCenter(homePage);
    }
}
