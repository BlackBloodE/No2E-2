package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class WinController {

    static Stage stage = new Stage();

    @FXML
    private Button btOk;
    @FXML
    private Button btR;


    public void btOkAction(){
        MainFrameController.stage.close();
        OOXXController.stage.close();
        loginController.stage.show();
    }

}
