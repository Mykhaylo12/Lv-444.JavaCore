package myp;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Morze {

	private static Map<Character, String> hm = new HashMap<Character, String>();
	private static Map<String, Character> hm1 = new HashMap<String, Character>();

	public static void map() {
		hm.put('a', ".-");
		hm.put('b', "-...");
		hm.put('c', "-.-.");
		hm.put('d', "-..");
		hm.put('e', ".");
		hm.put('f', "..-.");
		hm.put('g', "--.");
		hm.put('h', "....");
		hm.put('i', "..");
		hm.put('j', ".---");
		hm.put('k', "-.-");
		hm.put('l', ".-..");
		hm.put('m', "--");
		hm.put('n', "-.");
		hm.put('o', "---");
		hm.put('p', ".--.");
		hm.put('q', "--.-");
		hm.put('r', ".-.");
		hm.put('s', "...");
		hm.put('t', "-");
		hm.put('u', "..-");
		hm.put('v', "...-");
		hm.put('w', ".--");
		hm.put('x', "-..-");
		hm.put('y', "-.--");
		hm.put('z', "--..");
		hm.put(' ', "/");
	}

	public static void map_decod() {
		hm1.put(".-", 'a');
		hm1.put("-...", 'b');
		hm1.put("-.-.", 'c');
		hm1.put("-..", 'd');
		hm1.put( ".", 'e');
		hm1.put("..-.", 'f');
		hm1.put("--.", 'g');
		hm1.put( "....", 'h');
		hm1.put("..", 'i');
		hm1.put(".---", 'j');
		hm1.put( "-.-", 'k');
		hm1.put(".-..", 'l');
		hm1.put("--", 'm');
		hm1.put("-.", 'n');
		hm1.put( "---", 'o');
		hm1.put(".--.", 'p');
		hm1.put("--.-", 'q');
		hm1.put( ".-.", 'r');
		hm1.put("...", 's');
		hm1.put("-", 't');
		hm1.put("..-", 'u');
		hm1.put("...-", 'v');
		hm1.put( ".--", 'w');
		hm1.put("-..-", 'x');
		hm1.put("-.--", 'y');
		hm1.put("--..", 'z');
		hm1.put("/", ' ');
	}

	public static void coder(String a) throws IOException {

		for (char letter : a.toCharArray()) {
			for (char key : hm.keySet()) {
				if (letter == key) {
					System.out.print(hm.get(key));
					System.out.print(" ");
				}
			}
		}
		System.out.println();

	}

	public static void decoder(String a) throws IOException {
		String[] arr = a.split(" ");
		for (int i = 0; i < arr.length; i++) {
			for (String s : hm1.keySet()) {
				if (arr[i].equals(s)) {
					System.out.print(hm1.get(s));

				}
			}
		}

		System.out.println();

	}

	public static void coder2(List<String> ar) throws IOException {
		File file = new File("Text1.txt");
		file.createNewFile();
		FileWriter fw = new FileWriter("Text1.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		for (int i = 0; i < ar.size(); i++) {
			for (char letter : ar.get(i).toCharArray()) {
				for (char key : hm.keySet()) {
					if (letter == key) {
						System.out.print(" ");
						bw.write(hm.get(key) + " d");
					}
				}
			}
			System.out.println();
			bw.write("\n");
		}
		bw.close();
	}
}