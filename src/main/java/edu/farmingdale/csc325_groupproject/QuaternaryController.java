package edu.farmingdale.csc325_groupproject;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;

public class QuaternaryController implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 
    @FXML
    void InputData(ActionEvent event) {
        
    }
    @FXML
    private void switchToMenu() throws IOException {
        App.setRoot("Menu");
    }
}
