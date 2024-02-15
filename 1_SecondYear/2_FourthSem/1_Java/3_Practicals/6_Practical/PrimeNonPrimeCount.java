// Practical No. 06
// Program to count the given number is prime or not and store the count of it
import java.lang.Scanner;

class PrimeNonPrimeCount {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
               
    }
    
    // Generating array using nanoTime() method of System class
     int[] generateArray(int size) {
        if (size <= 0) 
            return 0;
     
        int[] arrayNums = new int[size];
        for (int i = 0; i < size; i++) {
            arrayNums[i] = System.nanoTime();
            System.out.print();System.out.print();System.out.print();
        }
        return arrayNums;
     }
     
     // Function to generate seven digits from the array 
     //1234567   << 123456789012
     int[] getSevenDigitsArray(int[] arr) {
          int size = arr.length;
          int[] getDigit = new int();
          
          for (int i = 0; i < size; i++) {
              String no = Integer.toString(arr[i]);
              String sevenDigits = no.substring(0,7);
              getDigit[i] = Integer.parseInt(sevenDigits, 10);            
          }
          return getDigit;          
     }
     
     // function to get digits from the sevenDigits Array
     int getDigits(int[] arr){
          int size = arr.length;
          for (int i = 0; i < size; i++) {
              
          }
     }
      
    // function to find the given number is prime or not
    boolean isPrime(int number) {
      
    }
    
    // Function to count prime and store the result
    int countPrime(){
    
    }
    
    // Function to count non prime numbers and store the result
    int countNonPrime() {
    
    }
    
    
    
    
}

