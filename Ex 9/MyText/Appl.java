import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Prepare mytext.txt file with a lot of text inside.
//Read context from file into array of strings.
//Each array item contains one line from file.
//Complete next tasks:
//   1) count and write the number of symbols in every line.
//   2) find the longest and the shortest line. 
//   3) find and write only that lines, which consist of word «var»

public class Appl {
	private static void InsertIn (List<String> list,int index, String element) {
		if (list.size()>index-1) {
		list.add(index, element);
			System.out.println("Insert "+element+" on pisition "+index);
		} else {
			System.out.println("Array size < "+ index);
		}
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> myCollection = new ArrayList<String>();
		String fileName = "C:\\Users\\ostetsktc\\eclipse-workspace\\MyText\\src\\MyText.txt";
		FileReader fr = null;
		BufferedReader br = null;
		String shorteststring ="";
		String longeststring ="";
		int shortcount =0;
		int longcount=0;

		try {
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			String s = null;
			int count = 0;
			System.out.println("Read data from file: " + fileName);
			while ((s = br.readLine()) != null) {
				//System.out.println("row " + ++count + " read:" + s);
				Appl.InsertIn(myCollection, count, s);
				++count;
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	for (Iterator iterator = myCollection.iterator(); iterator.hasNext();) {
		String string = (String) iterator.next();
		System.out.println(string.toString()+" "+string.length());
	}
		
	}

}
