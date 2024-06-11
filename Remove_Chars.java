

public class Remove_Chars {
    public static void main(String[] args) throws Exception {


        String A = "*******h*e*l*lo*******";
        String B = String.valueOf(A);
        

        for(int i = 0 ; i <= B.length(); i++){
            if(A.startsWith("*"))
            {
                StringBuilder K = new StringBuilder(A);
                K.deleteCharAt(0);
                A = K.toString();
                
            }
            else if (A.endsWith("*")) {
                StringBuilder K = new StringBuilder(A);
                K.deleteCharAt(A.length()-1);
                A = K.toString();
                
            }

            
            
        }

        System.out.println(A);
        

    }
}
