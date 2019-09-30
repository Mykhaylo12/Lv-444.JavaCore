package classwork4.kryvenkosergii_lv44;

public class App4 {

	private static void check(String name1, int price1, int quantitu1, String name2, int price2, int quantitu2,
			String name3, int price3, int quantitu3, String name4, int price4, int quantitu4) {

		//Checking the most expensive item
		if (price1 > price2 && price1 > price3 && price1 > price4) {
			System.out.printf("Most expensive item it's the %s in quantity %d ps\n", name1, quantitu1);
		} else if (price2 > price1 && price2 > price3 && price2 > price4) {
			System.out.printf("Most expensive item it's the %s in quantity %d ps\n", name2, quantitu2);
		} else if (price3 > price1 && price3 > price2 && price3 > price4) {
			System.out.printf("Most expensive item it's the %s in quantity %d ps\n", name3, quantitu3);
		} else if (price4 > price1 && price4 > price2 && price4 > price3) {
			System.out.printf("Most expensive item it's the %s in quantity %d ps\n", name4, quantitu4);
		}

		//Checking the items, which has the biggest quantity
		if (quantitu1 > quantitu2 && quantitu1 > quantitu3 && quantitu1 > quantitu4) {
			System.out.printf("The item which has the biggest quantity it's the %s\n", name1);
		} else if (quantitu2 > quantitu1 && quantitu2 > quantitu3 && quantitu2 > quantitu4) {
			System.out.printf("The item which has the biggest quantity it's the %s\n", name2);
		} else if (quantitu3 > quantitu1 && quantitu3 > quantitu2 && quantitu3 > quantitu4) {
			System.out.printf("The item which has the biggest quantity it's the %s\n", name3);
		} else if (quantitu4 > quantitu1 && quantitu4 > quantitu2 && quantitu4 > quantitu3) {
			System.out.printf("The item which has the biggest quantity it's the %s\n", name4);
		}

	}

	public static void main(String[] args) {
		Product p1 = new Product("apple", 3, 10);
		Product p2 = new Product("orange", 15, 3);
		Product p3 = new Product("onion", 2, 6);
		Product p4 = new Product("carrot", 5, 8);

		check(p1.getName(), p1.getPrice(), p1.getQuantitu(), p2.getName(), p2.getPrice(), p2.getQuantitu(),
				p3.getName(), p3.getPrice(), p3.getQuantitu(), p4.getName(), p4.getPrice(), p4.getQuantitu());

	}

}
