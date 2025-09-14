// Check if the number is an Armstrong number

public class armstrongcheck {
    public static void main(String[] args) {
        int number = 153; 
        int original = number;
        int result = 0;

        int digits = 0;
        int temp = number;
        while (temp != 0) {
            temp /= 10;
            digits++;
        }

        temp = number;
        while (temp != 0) {
            int digit = temp % 10;
            result += Math.pow(digit, digits);
            temp /= 10;
        }

        if (result == original)
            System.out.println(original + " is an Armstrong number.");
        else
            System.out.println(original + " is not an Armstrong number.");
    }
}
