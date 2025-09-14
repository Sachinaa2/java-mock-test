// factorial using recursion

public class factorialrecursion {
    public static long factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        else
            return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int number = 5; // Change this value to test other inputs
        long result = factorial(number);

        System.out.println("Factorial of " + number + " using recursion is: " + result);
    }
}
