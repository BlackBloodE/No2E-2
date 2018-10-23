package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

import java.io.IOException;

public class MainFrameController {

    static Stage stage = new Stage();

    @FXML
    private MenuItem OOxx;


    public void OOxxAction() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("OOXX.fxml"));
        stage.setTitle("OOXX");
        stage.setScene(new Scene(root));
        stage.show();
        loginController.stage.close();
    }

    public void eAction() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Encryption.fxml"));
        stage.setTitle("Encryption");
        stage.setScene(new Scene(root));
        stage.show();
        loginController.stage.close();
    }

    public void e2Action() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Encryption2.fxml"));
        stage.setTitle("Encryption2");
        stage.setScene(new Scene(root));
        stage.show();
        loginController.stage.close();
    }

    public void FMIClAction(){
        System.exit(0);
    }

}
