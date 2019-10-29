package range;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public enum NumToWord {
	n(0),One(1), Two(2), Three(3), Four(4), Five(5), Six(6), Seven(7), Eight(8), Nine(9), Ten(10), eleven(11), twelve(
			12), thirteen(13), fourteen(14), fifteen(15), sixteen(16), seventeen(17), eighteen(18), nineteen(
					19), twenty(20), thirty(30), forty(40), fifty(50), sixty(60), seventy(
							70), eighty(80), ninety(90), hundred(100), thousand(1000), million(1000000), UNKNOWN(-1);

	private final int iNumber;

	NumToWord(int iNumber) {
		this.iNumber = iNumber;

	}

	public static NumToWord valueOf(int iNumber) {
		for (NumToWord numtoword : NumToWord.values()) {
			if (numtoword.iNumber == iNumber) {
				return numtoword;
			}
		}
		return NumToWord.UNKNOWN;
	}

	public int getNumber() {
		return iNumber;
	}

	public static String printEng(String line) {
		int number;
		int number1;
		int number2;
		int number3;
		int number4;
		int number5;
		int number6;
		
		String numberline;
		int numberdigets;

		
		//System.out.println("Input number.Number must be in range from 1 to 1000000");		
		numberline=line;
		numberdigets=numberline.length();

		
		number=Integer.parseInt(numberline);
		
		//Input Number

		NumToWord numtoword= NumToWord.valueOf(Integer.parseInt(numberline));
		
		if (!(numtoword.getNumber()==-1)) {
			 System.out.println(numtoword.name());			
		}



		switch (numberdigets) {
		case 2:

			number2=number/10*10;
			number1=number-number2;
			System.out.println(NumToWord.valueOf(number2).name()+" "+NumToWord.valueOf(number1).name());
			break;

		case 3:
		
			number3=number/100;
			number2=(number-(number3*100))/10*10;
			number1=(number-(number3*100)-(number2));
			
			System.out.println(NumToWord.valueOf(number3).name()+" "+NumToWord.valueOf(100).name()+" "+
					NumToWord.valueOf(number2).name()+" "+NumToWord.valueOf(number1).name());
			break;	
		
		case 4:
			number4=number/1000;
			number3=(number-(number4*1000))/100;
			number2=(number-(number4*1000)-(number3*100))/10*10;
			number1=number-number4*1000-number3*100-number2;

			System.out.println(NumToWord.valueOf(number4).name()+" "+NumToWord.valueOf(1000).name()+" "+NumToWord.valueOf(number3).name()+" "+NumToWord.valueOf(100).name()+" "+
					NumToWord.valueOf(number2).name()+" "+NumToWord.valueOf(number1).name());
			break;
		case 5:

			number5=(number/10000)/10*10;
			number4=(number-(number5*10000))/1000;
			number3=(number-(number5*10000)-(number4*1000))/100;
			number2=(number-(number5*10000)-(number4*1000)-(number3*100))/10*10;
			number1=(number-(number5*10000)-(number4*1000)-(number3*100)-(number2));
			
			System.out.println(NumToWord.valueOf(number5).name()+" "+NumToWord.valueOf(number4).name()+" "+NumToWord.valueOf(1000).name()+" "+NumToWord.valueOf(number3).name()+" "+NumToWord.valueOf(100).name()+" "+
					NumToWord.valueOf(number2).name()+" "+NumToWord.valueOf(number1).name());
			break;
/*		case 6:
			number2=number/10;			
			number3=number/100;
			number4=number/1000;
			number5=number/10000;
			number6=number/100000;
			System.out.println(NumToWord.valueOf(number6).name());	*/		
			
/*			break;*/
		default:
			System.out.println("Unknown number!!!");
			break;
		}

		return line;
		
	}
}