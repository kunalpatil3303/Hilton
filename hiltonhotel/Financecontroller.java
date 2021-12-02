package com.example.hiltonhotel;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;

import javafx.stage.Stage;
import javafx.event.ActionEvent;


public  class Financecontroller extends NullPointerException
{
    @FXML
    private Label label;
    @FXML
    private ChoiceBox<String> checkbox;
    private final String[] select={"Restaurant","Banquet"};


    @FXML
    protected void save(ActionEvent e)
    {

    }
    @FXML
    protected void Total(ActionEvent e)
    {

    }
    @FXML
    protected void goback(ActionEvent e)

    {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Dashboard.fxml"));
            ((Node)(e.getSource())).getScene().getWindow().hide();
            Parent root1 = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
        } catch(Exception ep) {
            ep.printStackTrace();
        }
    }
}