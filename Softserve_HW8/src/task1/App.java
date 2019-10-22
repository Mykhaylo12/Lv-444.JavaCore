package task1;

public class App {
    public static double div(double a, double b) throws DoubleDivByZeroException{
       if (b == 0){
            throw new DoubleDivByZeroException("Divide 0 by 0 you get not numeric value: "+a/b);
       }
       else {
            return a/b;
       }
    }

    public static void main(String[] args) {
        double a=-3;
        double b=0;
        try{
            System.out.println(div(a,b));
        }
        catch (Exception e){
            System.err.println(e);
        }
    }
}
