package classwork13.kryvenkosergii_lv44;

public class Task5 {

	public static void checkPalindrom (String st) {
		StringBuilder sb = new StringBuilder(st);
		if (st.equals(sb.reverse().toString())) {
			System.out.println("text is polindrom");
		} else {
			System.out.println("text isn't polindrom");
		}
	}
}
