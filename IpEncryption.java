import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class IpEncryption {
    public static void main(String[] args) {
        try {
            // for production
            String secretKey = "391540f9191f4c12b0e2b89543c804bb";
            // String dataToEncrypt = "103.104.73.207:9001"; --prod link

            String dataToEncrypt = "103.104.73.207:8999";
            // String secretKey = "391540f9191f4c12b0e2b89543c804bb";
            // String secretKey="50b30dbd2fc44eb286b7a47f5a36c296";
            
            // for testing
            // String secretKey = "bbba4bd55b4649a5bfd633169ccc5355";
            // String dataToEncrypt = "14.98.68.106:9000";
            // String dataToEncrypt = "192.168.5.27";

//            byte[] keyBytes = secretKey.getBytes(StandardCharsets.UTF_8);
//            Key key = new SecretKeySpec(keyBytes, "AES");

            byte[] key = secretKey.getBytes(StandardCharsets.UTF_8);
            byte[] plaintextBytes = dataToEncrypt.getBytes("UTF-8");
            SecretKeySpec secretKeySpec = new SecretKeySpec(key, "AES");
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);
            String encryptedBase64 = Base64.getEncoder().encodeToString(cipher.doFinal(plaintextBytes));
//
//            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
//            cipher.init(Cipher.ENCRYPT_MODE, key);
//
//            byte[] encryptedBytes = cipher.doFinal(dataToEncrypt.getBytes(StandardCharsets.UTF_8));
//
//            String encryptedBase64 = Base64.getEncoder().encodeToString(encryptedBytes);
            System.out.println("Encrypted Data: " + encryptedBase64);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
