import java.util.Scanner;
import java.lang.String;

class Registration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Registration reg = new Registration();
        
        System.out.print("Enter the count of Students: ");
		    int iCount = sc.nextInt();
		    
		    // array to store final string of the registration number
		    String[] sYDS = new String[iCount];
		
		   // generating random array using nanoTime() method of System class
		   for (int i = 0; i < iCount; i++) {
		        // creating array to store nanoTime()
            long[] year = new long[iCount];
            year[i] = System.nanoTime();
            /*try {
               Thread.sleep(100);
            } catch (InterruptedException e) {
              e.printStackTrace();
            }*/
            
            // converting nanoTime to string 
            String[] send = new String[iCount];
            send[i] = Long.toString(year[i]);
            
            String pass = send[i];
            
            // calling functions to get year, dept, seqn from the nanoTime String (34754789875)
            String iYear = reg.getYear(pass);
            String iDept = reg.getDept(pass);
            String iSeqn = reg.getSeqn(pass);
            
            sYDS[i] = iYear+iDept+iSeqn;
       } // end of for
       
      // calling validRegistratinoscount function to know how many valid registrations are their
      System.out.println("Valid registration count : " + reg.getValidRegistrationsCount(sYDS));
    }  
    
    // get year from nanoTime
    // 34754789875  (3475)
    public String getYear(String time) {
       String getFour = time.substring(0,4);
       return getFour;    
    } 
    
    // create dept from nanoTime
    // 34754789875  34 
    public String getDept(String time) {
        String getSix = time.substring(2,10);
            int num1 = stringToInt1(getSix.substring(2, 4));
            String firstLetter = Character.toString(num1);  
            
            int num2 = stringToInt1(getSix.substring(4, 6));
            String secondLetter = Character.toString(num2);  
            
            int num3 = stringToInt1(getSix.substring(6, 8));
            String thirdLetter = Character.toString(num3); 
            
            String finalDept = firstLetter + secondLetter + thirdLetter;
            return finalDept;
      }    
      
    // get seqn from nano time
    public String getSeqn(String time) {
       String getThree = time.substring(0,3);
       return getThree;       
    } 
		  
    
    // Function to perform valid registrations of student and return its count.  
    public int getValidRegistrationsCount(String[] regStrArray) {
        int validCount = 0;
        int lenRegStr = regStrArray.length;
             
        for (int i = 0; i < lenRegStr; i++) {
            String year = regStrArray[i].substring(0, 4); 
            String dept = regStrArray[i].substring(4, 7); 
            String seqn = regStrArray[i].substring(7, 10); 
            
            if (isValidYear(year) && isValidDept(dept) && isValidSeqn(seqn)) {
                  validCount++;
            } 
        }               
        return validCount;
    }
    
    // Function to check valid year or not
    public boolean isValidYear(String year) {
        int iYear = stringToInt2(year);
        
        if ((iYear >= 1961) && (iYear <= 2023))
            return true;
        else 
            return false;        
    }
    
    // Function to check valid department or not
    public boolean isValidDept(String dept) {
        if ((dept.equalsIgnoreCase("bit") || dept.equalsIgnoreCase("bcs") || dept.equalsIgnoreCase("bce") || dept.equalsIgnoreCase("bme"))) 
            return true;
        else 
            return false;
    }
    
    // Function to check valid sequence or not
    public boolean isValidSeqn(String seqn) {
        int iSeqn = stringToInt2(seqn);
        
        if (iSeqn <= 1000)
            return true;
        else
            return false;
            
    }
    
    // Approach 1: Function to convert string to int
    public int stringToInt1(String str) {
        return Integer.parseInt(str);
    }
    
    // Approach 2: Function to convert string to int
    // "2023" >> 2023
    public int stringToInt2(String str) {   
        char ch0 = str.charAt(0);
        int digit0 = Character.digit(ch0, 10);
        
        char ch1 = str.charAt(1);
        int digit1 = Character.digit(ch1, 10);
        
        char ch2 = str.charAt(2);
        int digit2 = Character.digit(ch2, 10);
        
        char ch3 = str.charAt(3);
        int digit3 = Character.digit(ch3, 10);
        
        int result = (digit0 * 1000) + (digit1 * 100) + (digit2 * 10) + (digit3 * 1);
        return result;
    }
    
    // Approach 3: Function to convert string to int (ASCII)
    public int stringToInt3(String str) {
        int number = Character.getNumericValue(str.charAt(0)) * 1000 + Character.getNumericValue(str.charAt(1)) * 100 + Character.getNumericValue(str.charAt(2)) * 10 + Character.getNumericValue(str.charAt(3)) * 1;     
        return number;
    }
    
    // Approach 4: Function to convert string to int
    public int stringToInt4(String str) {
        return 0;
    }
    
    // Approach 5: Function to convert string to int
    public int stringToInt5(String str) {
        return 0;
    }
}
