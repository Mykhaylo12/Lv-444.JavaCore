package HomeWork;


import java.io.*;

public class PhoneCalls {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input cost for first country: ");
        int c1 = Integer.parseInt(br.readLine());
        System.out.println("Input cost for second country: ");
        int c2 = Integer.parseInt(br.readLine());
        System.out.println("Input cost for third country: ");
        int c3 = Integer.parseInt(br.readLine());
        System.out.println("Input the length of the call with the first country: ");
        int t1 = Integer.parseInt(br.readLine());
        System.out.println("Input the length of the call with the second country: ");
        int t2 = Integer.parseInt(br.readLine());
        System.out.println("Input the length of the call with the third country ");
        int t3 = Integer.parseInt(br.readLine());
        System.out.println("Cost of a call to the first country: "+c1*t1);
        System.out.println("Cost of a call to the second country: "+c2*t2);
        System.out.println("Cost of a call to the third country: "+c3*t3);
        System.out.println("Total cost of a calls: "+(c1*t1+c2*t2+c3*t3));
    }
}
