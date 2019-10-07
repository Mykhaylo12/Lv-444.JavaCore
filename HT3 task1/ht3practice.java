package ht3task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ht3practice {

	public static void main(String[] args) throws IOException {

		float a;
		float b;
		float c;
		int d;
		int e;
		int f;
		int httpError;
		String errorDescription;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("please enter float a");
		a = Float.parseFloat(br.readLine());
		System.out.println("please enter float b");
		b = Float.parseFloat(br.readLine());
		System.out.println("please enter float c");
		c = Float.parseFloat(br.readLine());

		System.out.println(a >= -5 && a <= 5 && b >= -5 && b <= 5 && c >= -5 && c <= 5
				? "all floats belong to the given range [-5,5]"
				: "NOT all floats belong to the given range [-5,5]");

		System.out.println("please enter int d");
		d = Integer.parseInt(br.readLine());
		System.out.println("please enter int e");
		e = Integer.parseInt(br.readLine());
		System.out.println("please enter int f");
		f = Integer.parseInt(br.readLine());

		int[] numbers = { d, e, f };

		MaxMinFinder m = new MaxMinFinder();

		System.out.println(m.getMaxInt(numbers));
		System.out.println(m.getMinInt(numbers));

		System.out.println("please enter your HTTP error code");
		httpError = Integer.parseInt(br.readLine());

		switch (httpError) {
		case 400:
			errorDescription = String.valueOf(HTTPError.ERROR_400);
			break;
		case 401:
			errorDescription = String.valueOf(HTTPError.ERROR_401);
			break;
		case 402:
			errorDescription = String.valueOf(HTTPError.ERROR_402);
			break;
		case 403:
			errorDescription = String.valueOf(HTTPError.ERROR_403);
			break;
		case 404:
			errorDescription = String.valueOf(HTTPError.ERROR_404);
			break;
		default:
			errorDescription = "such HTTP error code is absent in the list";
		}
		System.out.println("your HTTP error is " + errorDescription);
	}
}
