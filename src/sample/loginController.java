package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

import static sample.KBController.str;

public class loginController {

    static Stage stage = new Stage();
    static String str = KBController.str;

    @FXML
    private Button btK;
    @FXML
    private TextField tf;
    @FXML
    private PasswordField pf;

    public void btKAction() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("KB.fxml"));
        str = KBController.str;
        pf.setText(str);
        stage.setTitle("KB");
        stage.setScene(new Scene(root));
        stage.show();
        //Main.stage.close();
    }

    public void initialize(){
        //tf.setText();
        str = KBController.str;
        pf.setText(str);
    }
}
