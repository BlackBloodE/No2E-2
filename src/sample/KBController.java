package sample;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class KBController {

    static Stage stage = new Stage();
    static String str = "";

    @FXML
    private Button bt0,bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,btSp1,btSp2;
    @FXML
    private Label lab1;
    private int[] x = new int[10];
    //private String str = "";



    public void bt0Action(){
        str = str + String.valueOf(x[0]-1);
        lab1.setText(str);
    }

    public void bt1Action(){
        str = str + String.valueOf(x[1]-1);
        lab1.setText(str);
    }

    public void bt2Action(){
        str = str + String.valueOf(x[2]-1);
        lab1.setText(str);
    }

    public void bt3Action(){
        str = str + String.valueOf(x[3]-1);
        lab1.setText(str);

    }

    public void bt4Action(){
        str = str + String.valueOf(x[4]-1);
        lab1.setText(str);

    }

    public void bt5Action(){
        str = str + String.valueOf(x[5]-1);
        lab1.setText(str);

    }

    public void bt6Action(){
        str = str + String.valueOf(x[6]-1);
        lab1.setText(str);

    }

    public void bt7Action(){
        str = str + String.valueOf(x[7]-1);
        lab1.setText(str);

    }

    public void bt8Action(){
        str = str + String.valueOf(x[8]-1);
        lab1.setText(str);

    }

    public void bt9Action(){
        str = str + String.valueOf(x[9]-1);
        lab1.setText(str);

    }

    public void btSp1Action(){
        btSp1.setText("開始");
        int max = 10;
        int min = 1;
        //Random random = new Random();
        for (int i = 0;i < x.length;i++){
//            x[i] = (int) (Math.random() * (max - min + 1) + min);
//            System.out.println(x[i]);
            int t = 0;
            pick:
            while (t == 0){
                t = (int)(Math.random()*max + min);

                for (int j = 0;j < i;j++){
                    if (x[j] == t){
                        t = 0;
                        continue pick;
                    }
                }
                x[i] = t;
                //System.out.println(x[i]);
            }
        }
        bt0.setText(String.valueOf(x[0]-1));
        bt1.setText(String.valueOf(x[1]-1));
        bt2.setText(String.valueOf(x[2]-1));
        bt3.setText(String.valueOf(x[3]-1));
        bt4.setText(String.valueOf(x[4]-1));
        bt5.setText(String.valueOf(x[5]-1));
        bt6.setText(String.valueOf(x[6]-1));
        bt7.setText(String.valueOf(x[7]-1));
        bt8.setText(String.valueOf(x[8]-1));
        bt9.setText(String.valueOf(x[9]-1));
        str = "";
        lab1.setText(str);
    }


    public void btSp2Action() throws Exception {
        loginController.stage.close();
        Main main=new Main();
        main.start(new Stage());
        Main.stage.show();
        //System.out.println(str);
    }

    public void initialize(){
        btSp1Action();
    }


//    @FXML
//    private loginController loginController;
//
//    Label getOutputPane() {
//        return loginController.lable;
//    }

}

