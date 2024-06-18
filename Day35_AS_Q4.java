
import java.util.Arrays;

public class Day35_AS_Q4{

    // You are given a function to_lower() which takes a character array A as an argument.
    // Convert each character of A into lowercase characters if it exists. If the lowercase of a character does not exist, it remains unmodified.
    // The uppercase letters from A to Z are converted to lowercase letters from a to z respectively.
    // Return the lowercase version of the given character array.

    //INPUT A = ['S', 'c', 'A', 'l', 'e', 'r', 'A', 'c', 'a', 'D', 'e', 'm', 'y']
    // OUTPUT: ['s', 'c', 'a', 'l', 'e', 'r', 'a', 'c', 'a', 'd', 'e', 'm', 'y']

    public static void main(String[] args) {
        char[] A ={'S', 'c', 'A', 'l', 'e', 'r', 'A', 'c', 'a', 'D', 'e', 'm', 'y'};
        System.out.println(Arrays.toString(to_Upper(A)));


    }

    public static char[] to_Upper(char[] A) {

        char[] B = new char[A.length];
        
        for(int i=0 ; i< A.length; i++){
            char C = Character.toUpperCase(A[i]);
            if(A[i]==C){
                B[i]=A[i];
            }
            else {
                B[i]=C;
            }
        }
        return B;
    }
}