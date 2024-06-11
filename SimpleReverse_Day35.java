public class SimpleReverse_Day35{ //----------->DONE

    public static void main(String[] args) {

        System.out.println(reverse("Scaler"));
        
    }

    public static String reverse(String A){

        String B = "";

        StringBuilder sc =new StringBuilder(B);

        for(int i = 1 ; i <= A.length() ; i++){
            System.out.println(i);
            sc.append(A.charAt(A.length()-i));
            System.out.println(sc);
           
        }

        B = sc.toString().toLowerCase();
        


        return B;
    }

}