// Swap two numbers (with and without third variable)

// Using third variable
public class swaptwonumbers {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        
        System.out.println("Before swap: a = " + a + ", b = " + b);
        
        int temp = a; 
        a = b;      
        b = temp;  
        
        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}




