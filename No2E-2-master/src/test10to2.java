import java.util.Scanner;

public class test10to2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //提示使用者輸入
        System.out.println("請輸入數字:");
        int number = input.nextInt();
        int x = number;

        System.out.println("0"+Integer.toBinaryString(x));
    }

}
