package myp;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Cesar {
	private static int offset = 3;

	public static void decryption(String s) throws IOException {
		offset = 26 - 3;
		encryption(s);
	}

	public static void encryption(String s) {
		offset = offset % 26 + 26;
		StringBuilder encryption1 = new StringBuilder();
		for (char i : s.toCharArray()) {
			if (Character.isLetter(i)) {
				if (Character.isUpperCase(i)) {
					encryption1.append((char) ('A' + (i - 'A' + offset) % 26));
				} else {
					encryption1.append((char) ('a' + (i - 'a' + offset) % 26));
				}
			} else {
				encryption1.append(i);
			}
			}
		System.out.println(encryption1.toString());
	}

	public static void encryption2(List<String> ar) throws IOException {
		File file = new File("Text1.txt");
		file.createNewFile();
		FileWriter fw = new FileWriter("Text1.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		offset = offset % 26 + 26;
		for (int j = 0; j < ar.size(); j++) {
			StringBuilder encryption1 = new StringBuilder();
			for (char i : ar.get(j).toCharArray()) {
				if (Character.isLetter(i)) {
					if (Character.isUpperCase(i)) {
						encryption1.append((char) ('A' + (i - 'A' + offset) % 26));
					} else {
						encryption1.append((char) ('a' + (i - 'a' + offset) % 26));
					}
				} else {
					encryption1.append(i);
				}

			}
			ar.set(j, encryption1.toString());
		}
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		for (int i = 0; i < ar.size(); i++) {
			bw.write(ar.get(i) + "\n");
		}
		bw.close();
	}
}
