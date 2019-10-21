//Create file1.txt file with a text about your career.
//Read context from file into array of strings. Each array item contains one line from file.
//Write in to the file2.txt
//   1) number of lines in file1.txt.
//   2) the longest line in file1.txt.
//   3) your name and birthday date. 
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Appl {
	public static String checkBirthday (String str) {

		//String pattern = "([0-2][0-9]|(3)[0-1])(\/)(((0)[0-9])|((1)[0-2]))(\/)\d{4}";
		String pattern = "\\d{1,2}\\.\\d{1,2}\\.\\d{4}";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(str);


		while (m.find()) {
		  return str.substring(m.start(), m.end());
		}	
		return "";
	}
	
	private static String checkName(String str) {
		String[] arr = new String[5];
		arr = str.split(" ");
		String name1 = "";
		for (int i = 1; i < arr.length; i++) {
			if (!arr[i].isEmpty()) {
				if (name1.isEmpty()) {
					name1 = arr[i];
				} else {
					name1 = name1 + " " + arr[i];
				}

			}

		}
		return name1;

	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String fileName = "./src/File1.txt";
		String fileName1 = "./src/File2.txt";
		FileWriter fw = null;
		BufferedWriter bw = null;
		FileReader fr = null;
		BufferedReader br = null;
		String name = "";
		String birthday = "";
		String longeststring = "";
		int linescount = 0;
		int longcount = 0;

		try {
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			String s = null;
			int count = 0;
			System.out.println("Read data from file: " + fileName);
			while ((s = br.readLine()) != null) {
				if (s.startsWith("name")) {
					name = checkName(s);
				}
				if (s.startsWith("birth")) {
					birthday = checkBirthday(s);
				}

				
				if (longcount < s.length()) {
					longcount = s.length();
					longeststring = s;
				}

				++count;
			}
			linescount = count;
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			fw = new FileWriter(fileName1);
			bw = new BufferedWriter(fw);
			System.out.println("Write data to file: " + fileName1);

			bw.write("Lines count: " + linescount + "\n");
			bw.write("Longest string: " + longeststring + "\n");
			bw.write("name: " + name + "\n");
			bw.write("birthday: " + birthday + "\n");

			bw.close();

		} catch (Exception e) {
			e.printStackTrace();
		}


	}

}
