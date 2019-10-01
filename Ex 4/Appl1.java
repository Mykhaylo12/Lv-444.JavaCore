

public class Appl1 {
//	Create an array of ten integers. Display 
//	the biggest of these numbers;
//	the sum of positive numbers in the array;
//	the amount of negative numbers in the array.
//	       What values there are more: negative or positive?
	
	private static int sum;

	private static int BiggestNum(int arr[]) {
		int max = arr[0];

		int i = 0;
		while (i < arr.length) {
			if (arr[i] > max) {
				max = arr[i];
			}
			i++;
		}
		return max;
	}

	private static int SumPos(int arr[]) {
		 sum = 0;
		for (int i = 0; i < arr.length; i++) { 
			if (arr[i]>0) {  
				sum += arr[i];
				}
			}


		return sum;
	}

	private static int AmountNeg(int arr[]) {
		int amount = 0;
		
		for (int a : arr) {
			if (a < 0) { amount++; }
		}



		return amount;
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[]ik=new int[10];
		int[]ik= {1,-7,5,8,8,10,-1,-7,3,9};
		
		int biggestNumber=0;
		int sumPos=0;
		int amountNeg=0;
		
		biggestNumber=BiggestNum(ik);
		sumPos=SumPos(ik);
		amountNeg=AmountNeg(ik);
		System.out.println("Biggest number :" + biggestNumber);
		System.out.println("Sum of positive :" + sumPos);
		System.out.println("Amount of negative :" + amountNeg);
		System.out.println(sum);
		
		
		
				
		
	}

}
