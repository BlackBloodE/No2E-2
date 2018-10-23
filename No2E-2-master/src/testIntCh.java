public class testIntCh {
    public static void main(String[] args) {
        int x = 123;
        char ch[] = Integer.toString(x).toCharArray();
        System.out.println(ch[0]);

        String str = "123";
        int zz[] = new int[1];
        zz[0] = Integer.valueOf(str);

        System.out.println(zz[0]);
//        String str = "1";
//        System.out.println(str.getBytes());
    }
}
