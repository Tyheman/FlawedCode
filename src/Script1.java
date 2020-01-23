/*This script will take print randomly generated numbers, adds them to arrays, then compares the arrays.
This script is intended to have flaws and lack of secure programming standards

Author: Tyler Mankey
 */
import java.util.Arrays;
import java.util.Random;

public class Script1{
    public static void main (String args[]) {
        int arr1[] = new int[20];
        int arr2[] = new int[20];


        /*
        Link: https://wiki.sei.cmu.edu/confluence/display/java/MSC02-J.+Generate+strong+random+numbers
        Violation: Generating true and Strong random Numbers
         */
        //RESOLVED - switched SecureRandom class to generate random numbers
        SecureRandom number = new SecureRandom();
        for (int i = 0; i < 20; i++) {
            // Generate another random integer in the range [0, 20]
            int n = number.nextInt(21);
            arr1[i] = n;
            arr2[i] = n;
        }

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        /*
        Link: https://wiki.sei.cmu.edu/confluence/display/java/EXP02-J.+Do+not+use+the+Object.equals%28%29+method+to+compare+two+arrays
        Violation: Comapring Arrays
         */
        //RESOLVED used the equals method in the Arrays class to compare array contents
        System.out.println(Arrays.equals(arr1, arr2));

    }
}


