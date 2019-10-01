
public class ProductMain {

	public static void main(String[] args) {

		Product firstProduct = new Product("Pen", 50, 200);
		Product secondProduct = new Product("Pencil", 20, 52);
		Product thirdProduct = new Product("Notebook", 40, 50);
		Product fourthProduct = new Product("Book", 200, 5);
		Product[] products = { firstProduct, secondProduct, thirdProduct, fourthProduct };

		MaxFinder m = new MaxFinder();

		System.out.println(m.getMostExpensiveProduct(products));
		System.out.println(m.getProductWithBiggestQuantity(products));

	}

}
