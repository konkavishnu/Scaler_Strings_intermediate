import java.util.Arrays;

public class Q3_Day14{ //---> Not DONE

    public static void main(String[] args) {

        System.out.println(Arrays.toString(solve("aabbcc", 98)));
        
    }



    public static int[] solve(String A, int B) {

        int C = 1;
        int[] Arr = new int[0];

        for(int i=0;i<A.length();i++){

            if((int)A.charAt(i)==B){
                int[] Arr2 = new int[C];
                C = C+1;
                Arr2[C]=i;
                Arr = Arrays.copyOf(Arr2, C);
                
            }
            
        }

        return Arr;
    }
}