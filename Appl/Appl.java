import java.lang.invoke.SwitchPoint;

public class Appl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//Odd	
		int count=0;
		int[] a = {11, 2, 3};
		
		for (int i=0;i < 3 ;i++){
		
		if((a[i]%2)>0) {
		
			count++;
			
		}
		
		}
		System.out.println(count);

		//Day of WEEK
		int dayW =5;
		public enum Localization {
			4 ("Thusday", "Четвер"), 5 ("Friday", "Пятниця");
			private final String ua;
			private final String en;

			Localization(String ua, String en) {
			this.ua = ua;
			this.en = en;
			}

			public String getUa() {
			return ua;
			}

			public String getEn() {
			return en;
			}
			}

		switch (dayW)
		{
		case 5:
				System.out.println("Friday");
			break;
		case 4:
				System.out.println("Thusday");
			break;
		}	
	
	}


	
}
