
//Enter 10 integer numbers. 
//Calculate the sum of first 5 elements if they are positive or product of last 5 element in the other case.


//Enter 5 integer numbers. Find 
//position of second positive number;
//minimum and its position in the array.



//WARNING Organize entering integers until the first negative number. DID NOT THIS CONDITION YET.
//Count the product of all entered even numbers.


public class Calculate {
	
	private static void CalculateSumFirst(int arr[]){
		int sum=0;
		int product=1;
		boolean negInFirst5Flag=false;		
		for (int i=0;i<arr.length-1;i++) {
			
			if((i<5)&&(negInFirst5Flag)){
				continue;
			}
			while (i<5) {
			
				if(arr[i]>=0)
				{
					sum+=arr[i];
					
				}else{
					negInFirst5Flag=true;
					break;
				}
				i++;
			}
//			if (!negInFirst5Flag) {
//				break;
//			}
			
			while ((i>4)&&(i<arr.length))
			{
				product*=arr[i];
				i++;
			}
		
		}
		if (!negInFirst5Flag) {
			System.out.println("Sum first 5 is "+sum);	
		} else {
			System.out.println("Product last 5 is "+product);
		}

	}
	
	private static void CalculatePos(int arr[]){
		final int POS_POSITIVE=1;
		
		int[]positive=new int[arr.length];

		int counterPositiveInAr=0;
		
		int posMinInArr=0;
		int MinInArr=arr[posMinInArr];

		int[]even=new int[arr.length];		
		int counterEvenInAr=0;
		int productEvenNumbers=1;

		for (int i = 0; i < arr.length; i++) {
			
			if (MinInArr>arr[i]) {
				MinInArr=arr[i];
				posMinInArr=i;
			}
			
			if (arr[i]>0) {
				positive[counterPositiveInAr]=arr[i];
				counterPositiveInAr++;
			}
			
			if (arr[i]%2==0) {
				even[counterEvenInAr]=arr[i];
				counterEvenInAr++;
			}

		}
		for (int i=0;i<even.length;i++) {
			if (!(even[i]==0)) {
				productEvenNumbers*=even[i];
			}
		}
	System.out.println("Second positive is "+ positive[POS_POSITIVE]);
	System.out.println("MIN value is "+ MinInArr+" ,Pos MIN Value is "+(posMinInArr+1));
	System.out.println("Product even is "+ productEvenNumbers);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr=new int[10];

		String sArr="";		
		for (int i=0;i<arr.length;i++) {
			arr[i] = (int) (Math.random()*(20)) - 10;
			sArr=sArr+" ["+arr[i]+"]"; 
		}
		System.out.println("Numbers in Arr");
		System.out.println(sArr);
		CalculateSumFirst(arr);
		
		// SECOND TASK
		int[]arr1=new int[5];

		String sArr1="";		
		for (int i=0;i<arr1.length;i++) {
			arr1[i] = (int) (Math.random()*(20)) - 10;
			sArr1=sArr1+" ["+arr1[i]+"]"; 
		}
		System.out.println("Numbers in Arr1");
		System.out.println(sArr1);
		CalculatePos(arr1);
	}

}
