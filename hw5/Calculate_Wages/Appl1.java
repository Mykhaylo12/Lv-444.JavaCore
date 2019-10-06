package com.softserve.lukas6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Appl1 {
	final static int FIELD_WAGE=1; 
	final static int EMPLOYEE_COUNT=5;
	
//	private static void bubbleSort(int arr[])
//    {
//        int n = arr.length;
//        for (int i = 0; i < n-1; i++)
//            for (int j = 0; j < n-i-1; j++)
//                if (arr[j] > arr[j+1])
//                {
//                    // swap temp and arr[i]
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//    }
	
	
	private static String InputVal() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));			
		return br.readLine();

	}
	
	private static Employee[] SortWages(Employee arr[], int fieldSort) {
		
 
        
		int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j].getWage() < arr[j+1].getWage())
                {
                    // swap temp and arr[i]
                    Employee temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }		
		
		
		return arr; 
	}
	
	private static void CalculateWages(Employee emp[]) throws NumberFormatException, IOException{
	
		for (Employee employee : emp) {
			
			if (employee instanceof SalariedEmployee) {
				System.out.println("Input number of hours worked for " + employee.getName());
				((SalariedEmployee) employee).setHours(Integer.parseInt(InputVal()));
				((SalariedEmployee) employee).calculatePay();
			}
			else {
				((ContractEmployee) employee).calculatePay();
			}
//			System.out.println(employee.toString());
		}
		
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		Employee [] emp = new Employee[EMPLOYEE_COUNT];
		//int [] printArr = new int [EMPLOYEE_COUNT]; 
		
		emp[0]= new SalariedEmployee("John","111222",20);
		emp[1]= new SalariedEmployee("Larry","111223",25);
		emp[2]= new ContractEmployee("Jane","222122", 1600);
		emp[3]= new ContractEmployee("Steven","222123", 2200);
		emp[4]= new ContractEmployee("Talbot","222124", 800);
		CalculateWages(emp);
		
		emp = SortWages(emp,FIELD_WAGE);
		
		for (int i = 0; i < emp.length; i++) {
			System.out.println(emp[i].toString());
		}
	}

}
