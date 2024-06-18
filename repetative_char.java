import java.util.HashMap;
import java.util.Map;

public class repetative_char {

    public static void main(String[] args) {
        
        String A = "Mynameisvishnu";
        String B = "";

        StringBuilder SC = new StringBuilder(A);
        StringBuilder SC2 = new StringBuilder(B);

        Map<String,Integer> C = new HashMap<>();

        C.hashCode();

        for(int i=0 ; i<A.length(); i++){
            
            

            if(C.containsKey(SC.substring(i, i+1))){

                // int update = C.get(SC.substring(i, i+1))+1;
                // C.put(SC.substring(i,i+1), update);
                SC2.append(SC.substring(i, i+1));

            }
            else{

                C.put(SC.substring(i,i+1), 1);
            }
        }

        B=SC2.toString();

        System.out.println(B.charAt(2));


    }
    
}
