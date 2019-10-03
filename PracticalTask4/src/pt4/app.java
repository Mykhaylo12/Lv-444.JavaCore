package pt4;

public class app {
    static int maxValue(int[] num){
        int tmp = num[0];
        for (int i: num) {
            tmp = tmp < i ? i : tmp;
        }
        return tmp;
    }

    static int sumOfPositive(int[] num){
        int sum = 0;
        for (int i: num) {
            sum += i>0 ? i : 0;
        }
        return sum;
    }

    static int amountPositive(int[] num){
        int count = 0;
        for (int i:num) {
            count += i>0 ? 1 : 0;
        }
        return count;
    }

    static int amountNegative(int[] num){
        int count = 0;
        for (int i:num) {
            count += i<0 ? 1 : 0;
        }
        return count;
    }

    public static void main(String[] args) {
    int[] numbers = new int[10];
    for (int i = 0; i < numbers.length ; i++) {
            numbers[i] = (int)(Math.random()*100);
        System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println(maxValue(numbers));
        System.out.println(sumOfPositive(numbers));
        System.out.println(amountNegative(numbers));
        System.out.println(amountPositive(numbers));
    }
}
