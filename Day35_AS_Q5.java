// You are given a function isalpha() consisting of a character array A.

// Return 1 if all the characters of a character array are alphanumeric (a-z, A-Z, and 0-9) else, return 0.



public class Day35_AS_Q5 {

    public static void main(String[] args) {

        char[] A ={'S', 'c', 'a', 'l', 'e', 'r', 'A', 'c', 'a', 'd', 'e', 'm', 'y'};

        System.out.println(Solve(A));
        
        
    }

    public static int Solve (char[] A){

        int B =0;

        for(int i=0 ; i < A.length ; i++){

            if(Character.isLetterOrDigit(A[i]) && B==0){
                B=0 ;
            }
            else{
                B=1;
            }
        }
        if(B==1){
            B=0;
        }
        else{B=1;}
    
        return B;
    }
    
}
