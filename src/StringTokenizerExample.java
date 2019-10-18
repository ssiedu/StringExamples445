
import java.util.StringTokenizer;


public class StringTokenizerExample {
    public static void main(String[] args) {

        String s="indore,bhopal,delhi,chennai;pune";
        StringTokenizer st=new StringTokenizer(s,",;o", true);
        System.out.println(st.countTokens());
        while(st.hasMoreTokens()) {
                System.out.println(st.nextToken());
        }
        System.out.println(st.countTokens());
        
    }
}
/*
    StringTokenizer
        to create the tokens of the given String
        -------------------------------------------

        constructors
        -----------------

            StringTokenizer(String)
            StringTokenizer(String, String)
            StringTokenizer(String, String, boolean)
            
        methods
        -----------------

            String nextToken()
            boolean hasMoreTokens()
            int countTokens()   //returns no of remaining tokens




*/
