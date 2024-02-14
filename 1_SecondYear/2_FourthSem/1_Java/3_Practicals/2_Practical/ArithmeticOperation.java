// Practical No. 02: Arithmetic operations in java
import java.util.Scanner;

class ArithmeticOperatin {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Arithmetic Operations\n"); 
      
      System.out.println("Enter first no. : ");
      int no1 = sc.nextInt();
      
      System.out.println("Enter second no. : ");
      int no2 = sc.nextInt();
      
        System.out.println("Addition       : " + add(no1, no2));
        System.out.println("Subtraction    : " + sub(no1, no2));
        System.out.println("Multiplication : " + mul(no1, no2));
        System.out.println("Division       : " + div(no1, no2));
        System.out.println("Modulus        : " + mod(no1, no2));
        System.out.println("Increment      : " + inc(no1, no2));
        System.out.println("Decrement      : " + dec(no1, no2));
        System.out.println("Negation       : " + neg(no1, no2));
        
    }
}
