package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Win2Controller {
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
