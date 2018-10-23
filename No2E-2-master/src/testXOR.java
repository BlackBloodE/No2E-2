import java.util.Scanner;

public class testXOR {
    public static void main(String[] args) {
        System.out.println("請輸入源碼");
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();//輸入的字串
        char ch[] = str.toCharArray();//將輸入的字串轉成字元陣列
        int x[] = new int[ch.length];//預先開一個int陣列，等等用來放字元的ASCII
        char ch2[][] = new char[ch.length][7];//等等用來放輸入字串的2進位制用[個別字][個別字的2進未知每個數字]
        System.out.println("請輸入Key(請與源碼等長)");
        String key = scn.nextLine();//Key的字串
        char chK[] = key.toCharArray();//將Key的字串放入字元陣列
        int k[] = new int[chK.length];//預先開一個int陣列，等等用來放Key的字元的ASCII
        char ch2k[][] = new char[ch.length][7];//等等用來放Key字串的2進位制用[個別字][個別字的2進未知每個數字]
        char chF[][] = new char[ch.length][7];//存放XOR結果用
        int intF[] = new int[ch.length];//存XOR之後的2進位值
        String strF = "";
        String strFF[] = new String[ch.length];
        char chFS[] = new char[ch.length];//存XOR之後的字元
        for (int i = 0;i < ch.length;i++){
            strFF[i] = "";
            x[i] = Integer.parseInt(Integer.toBinaryString(Integer.valueOf(ch[i])));//將輸入字串的個別字轉成ASCII再轉成2進位放入int陣列中
            k[i] = Integer.parseInt(Integer.toBinaryString(Integer.valueOf(chK[i])));//將Key字串的個別字轉成ASCII再轉成2進位放入int陣列中
            for (int j = 0;j < 7;j++){
                ch2[i][j] = Integer.toString(x[i]).charAt(j);//將2進位拆成個別數字放入字元陣列中
                ch2k[i][j] = Integer.toString(k[i]).charAt(j);//將2進位拆成個別數字放入字元陣列中

                chF[i][j] = Integer.toString(ch2[i][j] ^ ch2k[i][j]).charAt(0);//XOR
                strFF[i] = strFF[i] + chF[i][j];

            }
            intF[i] = Integer.parseInt(strFF[i],16);//將2進制轉16進制
            chFS[i] = (char) intF[i];
            //System.out.println(intF[i]);
            System.out.print(chFS[i]);

        }
    }
}
