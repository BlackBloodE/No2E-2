public class test {//Caesar加密法測試
    public static void main(String[] args) {
        String ss = "3";
        int z = Integer.valueOf(ss);
        String str = "Hi 123";
        String s = "";
        char[] ch = str.toCharArray();
        int x[] = new int[ch.length];
        for (int i = 0; i < ch.length; i++){
            x[i] = Integer.valueOf(ch[i]) + z;
            ch[i] = (char)x[i];
            s = s + ch[i];
        }
        System.out.println(ch);
        System.out.println(s);
        s = "";
        for (int j = 0; j < ch.length; j++){
            x[j] = Integer.valueOf(ch[j]) - z;
            ch[j] = (char)x[j];
            s = s + ch[j];
        }
        System.out.println(ch);
        System.out.println(s);
    }
}
