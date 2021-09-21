import java.util.*;


public class printnumbers {
  public static void main(String args[] ) throws Exception {
    
    // write your code here
    int firsthalf = 1, num = 6;
        int secondhalf = (num * num) + 1;// (num* num) + 1 = 17;
        int numOfSpaces = 0;
 
        for (int numOfLines = num; numOfLines >= 1;numOfLines--) { // num =4 ;
 

            for (int numOfSpacesCounter = numOfSpaces;numOfSpacesCounter >= 1; numOfSpacesCounter--) {
                System.out.print(" ");
            }
 
    
            for (int firstHalfCounter = 1; firstHalfCounter <= numOfLines;firstHalfCounter++) { 
 
                if (firstHalfCounter == numOfLines) // false 1 != 4
                    System.out.print((firsthalf++)); 
 
                else
                    System.out.print((firsthalf++) + "*");// 1*2*3*4 firsthalf=5/ firsthalf =8
            }
 
    
            for (int secondHalfCounter = 1; secondHalfCounter <= numOfLines; secondHalfCounter++) {
                System.out.print("*" + (secondhalf++));// secondhalf = 14 //*17*18*19*20
            }
 
            System.out.println();
            numOfSpaces +=2;
            secondhalf = (secondhalf - 1) - ((numOfLines - 1) * 2);
        }
  }
           
}