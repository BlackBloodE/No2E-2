package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class OOXXController {

    static Stage stage = new Stage();
    static Stage stage2 = new Stage();
    static String strP;

    @FXML
    private Button bt1,bt2;
//    @FXML
////    private Button bt2;
    @FXML
    private Button bt3;
    @FXML
    private Button bt4;
    @FXML
    private Button bt5;
    @FXML
    private Button bt6;
    @FXML
    private Button bt7;
    @FXML
    private Button bt8;
    @FXML
    private Button bt9;
    private int x = 1;
    @FXML
    private Label lab;

    //判斷該按鈕目前為O(0)或X(1)
    int b1 = 2;
    int b2 = 2;
    int b3 = 2;
    int b4 = 2;
    int b5 = 2;
    int b6 = 2;
    int b7 = 2;
    int b8 = 2;
    int b9 = 2;

    public void initialize() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Win.fxml"));
        stage.setTitle("Win");
        stage.setScene(new Scene(root));
        //stage.show();
        Parent root2 = FXMLLoader.load(getClass().getResource("Win2.fxml"));
        stage2.setTitle("Win2");
        stage2.setScene(new Scene(root2));
    }

    public void bt1Action(ActionEvent event) {
        //System.out.println("O");
        x++;
        if (x % 2 == 0){
            bt1.setText("O");
            b1 = 0;
            lab.setText("Player1");
            if ((b1 == b4 && b4 == b7) || (b1 == b2 && b2 == b3) || (b1 == b5 && b5 == b9)){
                strP = "Player1";
                stage.show();
                lab.setText("Player1 Win");
            }
        }
        else {
            bt1.setText("X");
            b1 = 1;
            lab.setText("Player2");
            if ((b1 == b4 && b4 == b7) || (b1 == b2 && b2 == b3) || (b1 == b5 && b5 == b9)){
                stage2.show();
                lab.setText("Player2 Win");
            }
        }
        //System.out.println("b1:" + b1);
        bt1.setDisable(true);

    }
    public void bt2Action(ActionEvent event) {
        //System.out.println("O");
        x++;
        if (x % 2 == 0){
            bt2.setText("O");
            b2 = 0;
            lab.setText("Player1");
            if ((b2 == b5 && b5 == b8) || (b2 == b1 && b1 == b3)){
                stage.show();
                lab.setText("Player1 Win");
            }
        }
        else {
            bt2.setText("X");
            b2 = 1;
            lab.setText("Player2");
            if ((b2 == b5 && b5 == b8) || (b2 == b1 && b1 == b3)){
                stage2.show();
                lab.setText("Player2 Win");
            }
        }
        //System.out.println("b2:" + b2);
        bt2.setDisable(true);
    }
    public void bt3Action(ActionEvent event) {
        //System.out.println("O");
        x++;
        if (x % 2 == 0){
            bt3.setText("O");
            b3 = 0;
            lab.setText("Player1");
            if ((b3 == b6 && b6 == b9) || (b3 == b2 && b2 == b1) || (b3 == b5 && b5 == b7)){
                stage.show();
                lab.setText("Player1 Win");
            }
        }
        else {
            bt3.setText("X");
            b3 = 1;
            lab.setText("Player2");
            if ((b3 == b6 && b6 == b9) || (b3 == b2 && b2 == b1) || (b3 == b5 && b5 == b7)){
                stage2.show();
                lab.setText("Player2 Win");
            }
        }
        //System.out.println("b3:" + b3);
        bt3.setDisable(true);
    }
    public void bt4Action(ActionEvent event) {
        //System.out.println("O");
        x++;
        if (x % 2 == 0){
            bt4.setText("O");
            b4 = 0;
            lab.setText("Player1");
            if ((b4 == b7 && b7 == b1) || (b4 == b5 && b5 == b6)){
                stage.show();
                lab.setText("Player1 Win");
            }
        }
        else {
            bt4.setText("X");
            b4 = 1;
            lab.setText("Player2");
            if ((b4 == b7 && b7 == b1) || (b4 == b5 && b5 == b6)){
                stage2.show();
                lab.setText("Player2 Win");
            }
        }
        //System.out.println("b4:" + b4);
        bt4.setDisable(true);
    }
    public void bt5Action(ActionEvent event) {
        //System.out.println("O");
        x++;
        if (x % 2 == 0){
            bt5.setText("O");
            b5 = 0;
            lab.setText("Player1");
            if ((b5 == b8 && b8 == b2) || (b5 == b4 && b4 == b6) || (b5 == b1 && b1 == b9) || (b5 == b7 && b7 == b3)){
                stage.show();
                lab.setText("Player1 Win");
            }
        }
        else {
            bt5.setText("X");
            b5 = 1;
            lab.setText("Player2");
            if ((b5 == b8 && b8 == b2) || (b5 == b4 && b4 == b6) || (b5 == b1 && b1 == b9) || (b5 == b7 && b7 == b3)){
                stage2.show();
                lab.setText("Player2 Win");
            }
        }
        //System.out.println("b5:" + b5);
        bt5.setDisable(true);
    }
    public void bt6Action(ActionEvent event) {
        //System.out.println("O");
        x++;
        if (x % 2 == 0){
            bt6.setText("O");
            b6 = 0;
            lab.setText("Player1");
            if ((b6 == b9 && b9 == b3) || (b6 == b5 && b5 == b4)){
                stage.show();
                lab.setText("Player1 Win");
            }
        }
        else {
            bt6.setText("X");
            b6 = 1;
            lab.setText("Player2");
            if ((b6 == b9 && b9 == b3) || (b6 == b5 && b5 == b4)){
                stage2.show();
                lab.setText("Player2 Win");
            }
        }
        //System.out.println("b6:" + b6);
        bt6.setDisable(true);
    }
    public void bt7Action(ActionEvent event) {
        //System.out.println("O");
        x++;
        if (x % 2 == 0){
            bt7.setText("O");
            b7 = 0;
            lab.setText("Player1");
            if ((b7 == b4 && b4 == b1) || (b7 == b8 && b8 == b9) || (b7 == b5 && b5 == b3)){
                stage.show();
                lab.setText("Player1 Win");
            }
        }
        else {
            bt7.setText("X");
            b7 = 1;
            lab.setText("Player2");
            if ((b7 == b4 && b4 == b1) || (b7 == b8 && b8 == b9) || (b7 == b5 && b5 == b3)){
                stage2.show();
                lab.setText("Player2 Win");
            }
        }
        //System.out.println("b7:" + b7);
        bt7.setDisable(true);
    }
    public void bt8Action(ActionEvent event) {
        //System.out.println("O");
        x++;
        if (x % 2 == 0){
            bt8.setText("O");
            b8 = 0;
            lab.setText("Player1");
            if ((b8 == b7 && b7 == b9) || (b8 == b5 && b5 == b2)){
                stage.show();
                lab.setText("Player1 Win");
            }
        }
        else {
            bt8.setText("X");
            b8 = 1;
            lab.setText("Player2");
            if ((b8 == b7 && b7 == b9) || (b8 == b5 && b5 == b2)){
                stage2.show();
                lab.setText("Player2 Win");
            }
        }
        //System.out.println("b8:" + b8);
        bt8.setDisable(true);
    }
    public void bt9Action(ActionEvent event) {
        //System.out.println("O");
        x++;
        if (x % 2 == 0){
            bt9.setText("O");
            b9 = 0;
            lab.setText("Player1");
            if ((b9 == b6 && b6 == b3) || (b9 == b8 && b8 == b7) || (b9 == b5 && b5 == b1)){
                stage.show();
                lab.setText("Player1 Win");
            }
        }
        else {
            bt9.setText("X");
            b9 = 1;
            lab.setText("Player2");
            if ((b9 == b6 && b6 == b3) || (b9 == b8 && b8 == b7) || (b9 == b5 && b5 == b1)){
                stage2.show();
                lab.setText("Player2 Win");
            }
        }
        //System.out.println("b9:" + b9);
        bt9.setDisable(true);
    }
}

