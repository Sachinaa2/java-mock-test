// palindrome check

public class palindromecheck {
    public static void main(String[] args) {
        int number = 121; // Change this to test different numbers
        int original = number;
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        if (original == reversed)
            System.out.println(original + " is a palindrome number.");
        else
            System.out.println(original + " is not a palindrome number.");
    }
}
