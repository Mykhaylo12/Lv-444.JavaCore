package task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static int readNumber(int start, int end) throws NumberFormatException{
        int tmp;
        try {
            try {
                tmp = Integer.parseInt(br.readLine());
                if (tmp<start){
                    throw new NumberReadException("Input number is less than start number");
                }
                else if (tmp>end){
                    throw new NumberReadException("Input number is more than start end");
                }
                else {
                    return tmp;
                }
            }
            catch (NumberFormatException e){
                throw new NumberReadException(e.getMessage());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] a= new int[10];
        for (int i = 0; i <a.length ; i++) {
            a[i]=readNumber(1,100);
        }
        for (int i: a) {
            System.out.println(i);
        }
    }
}
