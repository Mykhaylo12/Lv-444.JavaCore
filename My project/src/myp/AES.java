package myp;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

public class AES {
	private static SecretKeySpec key = new SecretKeySpec("LvivJavaCore4444".getBytes(), "AES");
	private static byte[] b;

	public static void encrypt(String ar) throws InvalidKeyException, IOException, IllegalBlockSizeException,
			BadPaddingException, NoSuchAlgorithmException, NoSuchPaddingException {
		Cipher cipher = Cipher.getInstance("AES");
		cipher.init(Cipher.ENCRYPT_MODE, key);
		AES.b = cipher.doFinal(ar.getBytes());
		for (byte x : b) {
			System.out.print(x);
		}

	}

	public static void decrypt() throws InvalidKeyException, IOException, IllegalBlockSizeException,
			BadPaddingException, NoSuchAlgorithmException, NoSuchPaddingException {
		Cipher cipher1 = Cipher.getInstance("AES");

		cipher1.init(Cipher.DECRYPT_MODE, key);
		byte[] decript = cipher1.doFinal(b);
		for (byte x : decript) {
			System.out.print((char) x);
		}

	}

}
