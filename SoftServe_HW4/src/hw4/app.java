package hw4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class app {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    final static int[] month = {31,28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    static void checkDaysInMonth(int numberOfMonth){
        if (numberOfMonth>=1 && numberOfMonth<=12){
            System.out.println(month[numberOfMonth-1]);
        }
        else {
            System.out.println("Wrong input");
        }
    }

    static int readNumber() throws IOException {
        return Integer.parseInt(br.readLine());
    }

    static int[] readNumbers(int count) throws IOException {
        int[] array = new int[count];
        for (int i = 0; i < count; i++) {
            array[i] = readNumber();
        }
        return array;
    }

    static void orderedCarsByYear(Car[] cars){
        Car tmp;
        for (int i = 0; i < cars.length - 1; i++) {
            for (int j = i + 1; j < cars.length; j++) {
                if (cars[i].getYear() > cars[j].getYear()) {
                    tmp = cars[i];
                    cars[i] = cars[j];
                    cars[j] = tmp;
                }
            }
        }
    }

    static void printAllCarsByCertainYear(Car[] cars, int certainYear){
        for (Car car:cars) {
            if (car.getYear() == certainYear){
                System.out.println(car);
            }
        }
    }

    static void printCars(Car[] cars){
        for (Car car:cars) {
            System.out.println(car);
        }
    }


    public static void main(String[] args) throws IOException {
        // task1================================================================
        checkDaysInMonth(readNumber());
        //task2=================================================================
        int[] num2 = new int[10];
        num2 = readNumbers(num2.length);
        int sum = 0;
        for (int i = 0; i <5 ; i++) {
            if (num2[i]>=0){
                sum += num2[i];
            }
            else {
                sum=0;
                for (int j = 5; j < 10 ; j++) {
                    sum += num2[j];
                }
                break;
            }
        }
        System.out.println(sum);
        //task3 ==============================================================
        int[] num3 = new int[5];
        num3 = readNumbers(num3.length);
        int position = 0;
        int count = 0;
        for (int i = 0; i < num3.length ; i++) {
            if (num3[i]>0){
                count++;
                if (count==2){
                    System.out.println("Position of second positive number: "+i);
                    break;
                }
            }
        }
        position = 0;
        int min = num3[0];
        for (int i = 1; i <num3.length ; i++) {
            if (num3[i]<min) {
                min = num3[i];
                position = i;
            }
        }
        System.out.println("Minimum number is: "+min+" Position: "+position+" in the array");

        //task3a==============================================================================

        sum = 1;
        int tmp = 1;
        do{
            sum*=tmp;
            tmp = readNumber();
        }while (tmp>=0);
        System.out.println(sum);

        //Task4================================================================================
        Car[] cars = {new Car(2017, "Audi", 2.1), new Car(2008, "Suzuki", 2.0),
                new Car(1999, "VAZ", 1.1),new Car(1999, "ZAZ", 1.9)};

        printCars(cars);
        System.out.println();
        orderedCarsByYear(cars);
        printCars(cars);
        printAllCarsByCertainYear(cars,readNumber());


    }
}
