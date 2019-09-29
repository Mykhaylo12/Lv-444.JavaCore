package com.softserve.lukas4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Appl {


	public static void main(String[] args) throws NumberFormatException, IOException {
		// Necessary to add
		//check for empty string
		//check for input not number
		
		final int INT_COUNT = 3;
		final int FLOAT_COUNT = 3;
		// DECLARE arr for int numbers
		int iArray [] = new int[INT_COUNT];
		// DECLARE var for Min, Max integer;
		int iMin,iMax; 
		// DECLARE var for float in range (-5;5);
		boolean bFlInRange = true;
		//declare arr for float numbers
		float fArray []=new float [FLOAT_COUNT];
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//Input 3 int number
		for (int i=0;i<INT_COUNT;i++){
			System.out.println("Input int number:");
			iArray[i] = Integer.parseInt(br.readLine());
		}
	

		//Method 1 compare pairs
	
		// find iMax
			iMax=iArray[0];
			if (iArray[0]<iArray[1]) {
				iMax=iArray[1];
			}
			if (iArray[2]>iArray[1]) {
				iMax=iArray[2];
			}
		// find iMin	
			iMin=iArray[0];
			if (iArray[0]>iArray[1]) {
				iMin=iArray[1];
			}
			if (iArray[1]>iArray[2]) {
				iMin=iArray[2];
			}
			
		System.out.println("Min: " + iMin+ " Max: " + iMax);
		
		//Method by Sort
		Appl.bubbleSort(iArray);
		System.out.println("Min: " + iArray[0]+ " Max: " + iArray[INT_COUNT-1]);

		//Input 3 float number
		System.out.println("We check are three floats in range (-5,5) or not");
		for (int i=0;i<FLOAT_COUNT;i++){
			System.out.println("Input float number:");
			fArray[i] = Float.parseFloat(br.readLine());
			if (fArray[i]<-5 || fArray[i]>5 ) {
				bFlInRange=false;
			}

		}
		if (bFlInRange){
			System.out.println("All floats in range (-5,5)");
		}
		else
		{
			System.out.println(("Not all floats in range (-5,5)"));
		}
		
		br.close();	
	}

	
	private static void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }


}
