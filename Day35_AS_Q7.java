// Problem Description
//---------------------
// Given a string A of size N, find and return the longest palindromic substring in A.
// Substring of string A is A[i...j] where 0 <= i <= j < len(A)
// Palindrome string:
// A string which reads the same backwards. More formally, A is palindrome if reverse(A) = A.
// Incase of conflict, return the substring which occurs first ( with the least starting index).
//INPUT : A = "aaaabaaa"
// OUTPUT: "aaabaaa"
//EXPLANATION: We can see that longest palindromic substring is of length 7 and the string is "aaabaaa".


public class Day35_AS_Q7{ //--> NOT DONE

    public static void main(String[] args) {
        
        String A ="aaaabaaa";
        StringBuilder sc = new StringBuilder(A);

        for(int i =0 ; i<A.length() ; i++){

            for(int j=1; j<A.length() ; j++){

                String C = sc.substring(i, j);
                System.out.println(C.toString());

            }
        }
        
       
    }
    
}
