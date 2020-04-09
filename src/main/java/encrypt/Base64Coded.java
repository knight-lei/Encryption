package encrypt;

import org.apache.commons.codec.binary.Base64;

public class Base64Coded {
    //base64 解码
    public static String decodeBase64(byte[] bytes) {
        return new String(Base64.decodeBase64(bytes));
    }

    //base64 编码
    public static String encodeBase64(byte[] bytes) {
        return new String(Base64.encodeBase64(bytes));
    }
}
