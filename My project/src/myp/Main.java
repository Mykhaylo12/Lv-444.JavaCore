package myp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
//import java.util.ArrayList;
//import java.util.List;
//import java.io.FileReader;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException, InvalidKeyException, IllegalBlockSizeException,
			BadPaddingException, NoSuchAlgorithmException, NoSuchPaddingException {

		try {
			System.out.println("Enter type of crypter(1, 2, 3 )");
			String answer = br.readLine();
			switch (answer) {
			case "1":
				Cesar.encryption(Main.answer());
				if (answer_decrypt().equalsIgnoreCase("1")) {
					Cesar.decryption(Main.answer());
				}
				break;
			case "2":
				AES.encrypt(Main.answer());
				System.out.println();
				System.out.println("Do you want to return your words?(1-yes)(2-no)");
				String answer3 = br.readLine();
				if (answer3.equalsIgnoreCase("1"))
					AES.decrypt();

				break;
			case "3":
				Morze.map();
				Morze.coder(Main.answer());
				if (answer_decrypt().equalsIgnoreCase("1")) {
					Morze.map_decod();
					Morze.decoder(Main.answer());
				}
				break;
				
			}
		} catch (Exception e) {
			System.out.println("Fail");



		}
	}

	static String answer() throws IOException {
		System.out.println("Enter some words");
		String a = br.readLine();
		return a;
	}
	static String answer_decrypt() throws IOException {
		System.out.println("Do you want to decrypt something?(1-yes)(2-no)");
		String a = br.readLine();
		return a;
	}
}
//List<String> arrOfStrings = new ArrayList<String>();
//FileReader readFile = new FileReader("Text.txt");
//BufferedReader br1 = new BufferedReader(readFile);
//
//for (int i = 0; 1 > 0; i++) {
//	arrOfStrings.add(i, br1.readLine());
//	if (arrOfStrings.get(i) == null) {
//		arrOfStrings.remove(i);
//		break;
//	}
//}
