package hw7.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static String reverseStr(String st){
        StringBuilder str = new StringBuilder(st);
        return str.reverse().toString();
    }
    public static int findMaxIndex(String[] arr){
        int count = 0;
        int tmp = 0;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i].length()>tmp){
                tmp = arr[i].length();
                count = i;
            }
        }
        return count;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int index =findMaxIndex(arr);
        System.out.println(arr[index]+" length: "+arr[index].length());

        if (arr.length>=2){
            arr[1] = reverseStr(arr[1]);
        }
    }
}
