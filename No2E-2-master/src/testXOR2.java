public class testXOR2 {
    public static void main(String[] args) {
        String data="Hi";

        System.out.println("------------原文--------------");
        System.out.println(data);

        String after=new String(xorEncode(data.getBytes()));
        System.out.println("------------加密--------------");
        System.out.println(after);

        String before=new String(xorEncode(after.getBytes()));
        System.out.println("------------解密---------------");
    }
    public static byte[] xorEncode(byte[] data){

        //key，用于异或
        String key="No";
        byte[] keyBytes=key.getBytes();

        byte[] encryptBytes=new byte[data.length];
        for(int i=0; i<data.length; i++){
            encryptBytes[i]=(byte) (data[i]^keyBytes[i%keyBytes.length]);
        }
        return encryptBytes;
    }

}
