import static encrypt.Base64Coded.decodeBase64;
import static encrypt.Base64Coded.encodeBase64;

public class Main {
    public static void main(String[] args){
        String string = "Encryption test";
        //编码
        String encode = encodeBase64(string.getBytes());
        System.out.println(string +  "\t编码后的字符串为：" + encode);
        //解码
        String decode = decodeBase64(encode.getBytes());
        System.out.println(encode + "\t字符串解码后为：" + decode);
    }
}
