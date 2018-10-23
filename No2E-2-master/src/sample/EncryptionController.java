package sample;

import java.io.*;
import java.util.ArrayList;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class EncryptionController {

    static Stage stage = new Stage();

    @FXML
    private Button btRun;
    @FXML
    private TextField TF;
    @FXML
    private TextArea TA1;
    @FXML
    private TextArea TA2;
    @FXML
    private RadioButton RBEn;
    @FXML
    private RadioButton RBDe;
    @FXML
    private Button btC;
    @FXML
    private MenuButton MB;
    @FXML
    private MenuItem DES;
    @FXML
    private MenuItem MBC;
    @FXML
    private MenuItem XOR;


    private int x;
    //private char ch[];
    private String strTA1;
    private int z[] = new int[9999];
    private String s = "";
    private int time = 0;
    private String strED;
    private String strMB;

    public void btRunAction(){
        //System.out.println(strMB);
        if (strMB.equals("MBC")){
            //MB.setText("Caesar");
            x = Integer.valueOf(TF.getText());
            strTA1 = TA1.getText();
            if (strED.equals("En")) {
                char[] ch = strTA1.toCharArray();
                for (int i = 0; i < ch.length; i++) {
                    z[i] = Integer.valueOf(ch[i]) + x;
                    ch[i] = (char) z[i];
                    s = s + ch[i];
                }
                TA2.setText(s);
            }
            else {
                s = "";
                char[] ch = strTA1.toCharArray();
                for (int i = 0; i < ch.length; i++) {
                    z[i] = Integer.valueOf(ch[i]) - x;
                    ch[i] = (char) z[i];
                    s = s + ch[i];
                }
                TA2.setText(s);
            }
        }
        else if (strMB.equals("DES")){
            //MB.setText("DES");
            //System.out.println("Nothing");
            TA2.setText("此功能尚未完成");
        }
        else {
            //MB.setText("XOR");
            //System.out.println("Nothing");
            TA2.setText("此功能尚未完成");
        }

    }
    public void btCAction(){
        TA1.setText("");
        TA2.setText("");
        TF.setText("");
    }
    public void btClAction(){
        MainFrameController.stage.close();
        loginController.stage.show();
    }
    public void RBEnAction(){
        time = time + 1;
        if (time % 2 != 0) {
            RBDe.setDisable(true);
            strED = "En";
        }
        else {
            RBDe.setDisable(false);
            strED = "De";
        }
    }
    public void RBDeAction(){
        time = time + 1;
        if (time % 2 != 0) {
            RBEn.setDisable(true);
            strED = "De";
        }
        else {
            RBEn.setDisable(false);
            strED = "En";
        }
    }
    public void MBCAction(){
        MB.setText("Caesar");
        strMB = "MBC";
    }
    public void DESAction(){
        MB.setText("DES");
        strMB = "DES";
    }
    public void XORAction(){
        MB.setText("XOR");
        strMB = "XOR";
    }
    public void MBAction(){ }

    public void MIOAction() throws IOException {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Resource File");
        FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("TXT files (*.txt)", "*.txt");
        fileChooser.getExtensionFilters().add(extFilter);
        //fileChooser.showOpenDialog(stage);
        File file = fileChooser.showOpenDialog(null);
        //System.out.println(file);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String data = "";
        String row = null;
        while ((row = br.readLine()) != null){
            //row = row.replaceAll("\\s*","");//去掉空格
            data = data + row + "\n";
        }
        //String data = br.readLine();
        TA1.setText(data);
    }

    public void MIClAction(){
        MainFrameController.stage.close();
        loginController.stage.show();
    }

}
