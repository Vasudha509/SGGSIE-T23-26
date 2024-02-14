// Practical No. 04: Perform operations on Character class using its predefined methods.

import java.lang.Character;

class CharacterOperation {
    public static void main(String[] args) {
        Character ch = 'V';
        
        System.out.println("Given Character : " + ch);
        System.out.println("char value : " + ch.charValue());
        System.out.println("hash code  : " + ch.hashCode());
        System.out.println("equals     : " + ch.equals('A'));
        System.out.println("to string  : " + ch.toString());
        //System.out.println("char count : " + ch.charCount());
        System.out.println("is lower case : " + Character.isLowerCase(ch));
        System.out.println("is upper case : " + Character.isUpperCase(ch));
        System.out.println("is title case : " + Character.isTitleCase(ch));
        System.out.println("is digit      : " + Character.isDigit(ch));
        System.out.println("to lower case : " + Character.toLowerCase(ch));
        System.out.println("to upper case : " + Character.toUpperCase(ch));
        System.out.println("digit : " + Character.digit(ch, 10));
        System.out.println("get numeric value : " + Character.getNumericValue(ch));
  
    }
}
