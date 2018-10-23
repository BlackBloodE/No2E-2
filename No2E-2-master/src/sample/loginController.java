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
    @FXML
    private Button btlogin;
    @FXML
    private Button exit;

    static String Ac;

    public void btKAction() throws IOException {
        Ac = tf.getText();
        Parent root = FXMLLoader.load(getClass().getResource("KB.fxml"));
        str = KBController.str;
        pf.setText(str);
        stage.setTitle("KB");
        stage.setScene(new Scene(root));
        stage.show();
        //Main.stage.close();
    }

    public void loginAction() throws IOException {
        if (tf.getText().equals("root")){
            if (str.equals("1234")){
                Parent root2 = FXMLLoader.load(getClass().getResource("MainFrame.fxml"));
                stage.setTitle("MainFrame");
                stage.setScene(new Scene(root2));
                stage.show();
                Main.stage.close();
            }
        }
        else {
            System.out.println("error");
        }
        //System.out.println(tf.getText());
    }

    public void exitAction(){
        System.exit(0);
    }

    public void initialize(){
        //tf.setText();
        tf.setText(Ac);
        str = KBController.str;
        pf.setText(str);
    }
}
