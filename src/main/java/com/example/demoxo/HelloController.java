package com.example.demoxo;

import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;
import java.util.Scanner;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    private char[][] field = new char[3][3];

    private char move = 'X';

    private boolean isGame = true;

    @FXML
    void changesMove(ActionEvent event) {
        Button button = (Button) event.getSource();
        if(!isGame || button.getText() != "") return;

        int col = GridPane.getColumnIndex(button) == null? 0 : GridPane.getColumnIndex(button) ;
        int row = GridPane.getRowIndex(button) == null? 0 : GridPane.getRowIndex(button) ;

        field[row][col] = move;

        button.setText(String.valueOf(move));

        for(int i = 0; i < 3; i++){
            if(field[i][0]==move && field[i][1]==move && field[i][2]==move){
                Alert alr = new Alert(Alert.AlertType.INFORMATION, " Пабедил  "+ move);
                alr.showAndWait();
                isGame = false;
            }
        }
        for(int j = 0; j < 3; j++){
            if(field[0][j]==move && field[1][j]==move && field[2][j]==move){
                Alert alr = new Alert(Alert.AlertType.INFORMATION, " Пабедил  "+ move);
                alr.showAndWait();
                isGame = false;
            }
        }
        if(field[0][0]==move && field[1][1]==move && field[2][2]==move){
            Alert alr = new Alert(Alert.AlertType.INFORMATION, " Пабедил  "+ move);
            alr.showAndWait();
            isGame = false;
        }
        if(field[0][2]==move && field[1][1]==move && field[2][0]==move){
            Alert alr = new Alert(Alert.AlertType.INFORMATION, " Пабедил  "+ move);
            alr.showAndWait();
            isGame = false;
        }

        move = move == 'X' ? 'O' : 'X';

    }

    @FXML
    void initialize() {

    }

}
