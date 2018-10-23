package sample;

import javafx.fxml.FXML;
import javafx.scene.control.MenuButton;

public class EncryptionController2 {
    @FXML
    private MenuButton MB2;
    private String strMB;

    public void MIE2CAction(){
        MainFrameController.stage.close();
        loginController.stage.show();
    }
    public void Caesar2Action(){
        MB2.setText("Caesar");
        strMB = "Caesar";
    }
    public void DES2Action(){
        MB2.setText("DES");
        strMB = "DES";
    }
    public void XOR2Action(){
        MB2.setText("XOR");
        strMB = "XOR";
    }
}
