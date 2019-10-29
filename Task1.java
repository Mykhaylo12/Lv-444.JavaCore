package classwork13.kryvenkosergii_lv44;

public class Task1 {

	public static void getNumber(int num) {
		double fi1 = (1 + Math.sqrt(5)) / 2;
		double fi2 = (1 - Math.sqrt(5)) / 2;
		double a1 = 1;
		double a2 = 1;
		double numberFibonatchi = 0;
		for (int i = 1; i <= num; i++) {
			a1 *= fi1;
			a2 *= fi2;
			numberFibonatchi = (a1 - a2) / (Math.sqrt(5));
			System.out.println(numberFibonatchi);
		}
	}

}
