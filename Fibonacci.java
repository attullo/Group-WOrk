public class Fibonacci {
    public static int sumEvenFibonacci(int limit) {
        int sum = 0;
        int x = 1, y = 2, z = 0;
        while (y <= limit) {
            if (y % 2 == 0) {
                sum += y;
            }
            z = x + y;
            x = y;
            y = z;
        }
        return sum;
    }

    public static void main(String[] args) {
        int limit = 4000000;
        int sum = sumEvenFibonacci(limit);
        System.out.println("The sum of even-valued terms in the Fibonacci sequence whose values do not exceed " + limit + " is " + sum);
    }
}
