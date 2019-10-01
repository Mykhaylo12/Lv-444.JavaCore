package ht3task1;

public class MaxMinFinder {

	public int getMaxInt(int[] numbers) {
		int maxInt = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > maxInt) {
				maxInt = numbers[i];
			}
		}
		return maxInt;
	}

	public int getMinInt(int[] numbers) {
		int minInt = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] < minInt) {
				minInt = numbers[i];
			}
		}
		return minInt;
	}
}
