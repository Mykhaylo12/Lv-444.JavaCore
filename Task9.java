package classwork13.kryvenkosergii_lv44;

//9.Write method to return random value 0 or 1.
//Input number n, call this method n times and calculate how many times were number one
public class Task9 {
  public static void randomValue(int n) {
      for (int i = 0; i < n; i++) {
          System.out.println(Math.round(Math.random()));
      }
  }
}
