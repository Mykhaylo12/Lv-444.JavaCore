import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Enter in the console sentence of five words. 
//display the longest word in the sentence
//determine the number of its letters
//bring the second word in reverse order

//Enter a sentence that contains the words between more than one space. 
//Convert all spaces, consecutive, one. For example, 
//if we introduce the sentence 
//"I    am      learning     Java   Core», we have to get the "I'm learning Java Core»


//Implement a pattern for US currency: the first symbol "$", 
//then any number of digits, dot and two digits after the dot. 
//Enter the text from the console that contains several occurrences of US currency. 
//Display all occurrences on the screen.


public class Appl {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int maxLetterInLongWord=0;
		StringBuffer sa = new StringBuffer();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String sentence =br.readLine();
		
		// First task
		String [] arr = sentence.split(" ");
		sa=sa.append(arr[1]);
		sa=sa.reverse();
		System.out.println("Second word i reverse place: "+sa.toString());
		for (String string : arr) {
			if (string.length()>maxLetterInLongWord) {
				sa.setLength(0);
				//sa=sa.replace(0,sa.length(),"");
				sa=sa.append(string);
				maxLetterInLongWord=string.length();
			}
			//System.out.println(string);
			
		}
		System.out.println("Longest word "+sa.toString()+" ,count of letter = "+maxLetterInLongWord);
		
		sa.setLength(0);
		
		
		// Second task

		sentence =br.readLine();		
		sentence.replaceAll("\\s+"," ");

		arr= sentence.split(" ");
		for (String string : arr) {
			//System.out.println(string);
			if (!string.contentEquals("")) {
				//System.out.println(string);

				sa=sa.append(string+" ");
			}
		}
		String str =  sa.toString( );

		if (str.contains("I am")){ 
			str = str.replaceAll("I am","I'm");
					}
		System.out.println(str);
		
		
		// Third task (NOT WORK)
		String pattern = "\\$?([0-9]{1,3},([0-9]{3},)*[0-9]{3}|[0-9]+)(.[0-9][0-9])?$";
		//String pattern = "\\$(([1-9][0-9]*)|0)+(\\.[0-9]{2})?";
		String pattern = "\\$\\d+(\\,\\d{2})?";
		String text = "    $025,25   $45       $12,12";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(text);


		while (m.find()) {
		  System.out.print(text.substring(m.start(), m.end()));
		}

		
	}

}
