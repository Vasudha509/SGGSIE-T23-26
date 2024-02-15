// Practical No. 06: Count prime and non-prime numbers form the given array.

class PrimeCount {
    static int prime, nonPrime;
    public static void main(String[] args) {
       PrimeCount pc = new PrimeCount();
       
       // Generating array of 100000       
       int[] array = new int[100000];
       array = pc.getArray(100000);
       
       long startTime = System.nanoTime();
       pc.countPrimeNonPrime_1(array);
       long endTime = System.nanoTime();
       long totalTime = endTime - startTime;
       
       System.out.println("Prime count : "+ prime);
       System.out.println("Non prime count : " + nonPrime);
       System.out.println("Time required to find prime numbers count : " + totalTime);
       
       long startTime_2 = System.nanoTime();
       pc.countPrimeNonPrime_2(array);
       long endTime_2 = System.nanoTime();
       long totalTime_2 = endTime_2 - startTime_2;
       
       System.out.println("Prime count : "+ prime);
       System.out.println("Non prime count : " + nonPrime);
       System.out.println("Time required to find prime numbers count (second time): " + totalTime_2);
       /*for (int num : array) {
          System.out.println(num);
       }  */ 
    }
    
     // Method to count prime number and non-prime number - 
    int countPrimeNonPrime_1(int[] array) {
        prime = nonPrime = 0;
        
        for (int i = 0; i < array.length; i++) {
            int checkNumber = array[i];
            
            if (isPrime(checkNumber)) {
                prime++;
            } else {
                nonPrime++;    
            }
        } 
        return 0;
    }
    
     // Method to count prime number and non-prime number - 
    int countPrimeNonPrime_2(int[] array) {
        prime = nonPrime = 0;
        
        for (int i = 0; i < array.length; i++) {
            int checkNumber = array[i];
            
            if (!(isPrime(checkNumber))) {
                nonPrime++;
            } else {
                prime++;    
            }
        } 
        return 0;
    }
    
    // Method to check the given number is prime or not
    boolean isPrime(int no) {
        for (int i = 2; i < no; i++) {
              if (no % i == 0) {
                  //System.out.println("Inside isPrime: " + no);
                  return false;
              } else {
                  System.out.println("Inside isPrime: " + no);
                  return true;
              }
        }
        return false;
    }   
    
    // Method to create an array of integer 
    int[] getArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            // calling method getSevenDigits() to get 7 digits.
            array[i] = getSevenDigits(7);
           // System.out.println("Inside getArray : " +array[i]);
        }        
        return array;
    }
    
    // Method get random 7 digits number    
    // 7
    int getSevenDigits(int size) { 
        int number = 0;
        String sevenNum = "";
        
        for (int i = 0; i < size; i++) {
            int num = getDigit(); 
            while (num == 0) {
                num = getDigit();
            } // end of while
            
            String strNum = Integer.toString(num);
            sevenNum = sevenNum + strNum;         
        } // end of for
        
        number = Integer.parseInt(sevenNum);
        //System.out.println("Inside getSevenDigits: " + number);
        return number;
    }
    
    // function to create one digit number from nanoTime().
    int getDigit() {
        long time = System.nanoTime();
        long digit = time % 10;
        int sendDigit = (int) digit;
        //System.out.println("Inside getDigit : "+sendDigit); 
        return sendDigit;
    } 
}

