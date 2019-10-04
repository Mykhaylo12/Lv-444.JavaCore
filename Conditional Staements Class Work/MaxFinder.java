
public class MaxFinder {

	public String getProductWithBiggestQuantity(Product[] products) {
		int MaxQuantity = products[0].getQuantity();
		int indexOfMaxValue = 0;
		for (int i = 1; i < products.length; i++) {
			if (products[i].getQuantity() > MaxQuantity) {
				indexOfMaxValue = i;
			}
		}
		return products[indexOfMaxValue].getName();
	}

	public String getMostExpensiveProduct(Product[] products) {
		double MaxPrice = products[0].getPrice();
		int indexOfMaxValue = 0;
		for (int i = 1; i < products.length; i++) {
			if (products[i].getPrice() > MaxPrice) {
				indexOfMaxValue = i;
			}
		}
		return products[indexOfMaxValue].getName() + " " + String.valueOf(products[indexOfMaxValue].getQuantity());
	}

}
