// Fibonacci series using a loop

public class fibonacciloop {
    public static void main(String[] args) {
        int n = 10; // Number of terms to generate
        int first = 0, second = 1;

        System.out.println("Fibonacci Series using loop:");
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
