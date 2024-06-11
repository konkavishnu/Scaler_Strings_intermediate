import java.util.Arrays;

public class Reverse_String_Day35 {

    public static void main(String[] args) {

        String A = "crulgzfkif  gg ombt vemmoxrgf qoddptokkz op xdq hv";
        String B ="";

        StringBuilder sb = new StringBuilder(B);

        String[]Arr = A.split("[\\s+]");

        System.out.println(Arrays.toString(Arr));

        for(int i =1 ; i<=Arr.length ; i++){

            sb.append(Arr[Arr.length - i] + " ");
            
        }

        B = sb.toString().trim();
        

        System.out.println(B);

       
        
    }
    
}
