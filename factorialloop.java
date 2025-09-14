// Find factorial of the number loop

public class factorialloop {
    public static void main(String[] args) {
        int num = 5; // You can change this number to test other values
        int factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + num + " is " + factorial);
    }
}