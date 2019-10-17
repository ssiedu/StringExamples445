
import java.util.Scanner;


public class CountCapital {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A String");
        String s=sc.nextLine();
        char ch[]=s.toCharArray();
        int total=0;
        for(char tmp:ch){
            if(StringMethodsTwo.isCapital(tmp)){
                total++;
            }
        }
        System.out.println("TOTAL CAPITAL CHARS : "+total);
        /*
        byte b[]=s.getBytes();
        
        int total=0;
        
        for(byte tmp:b){
            if(tmp>=65 && tmp<=90){
                total++;
            }
        }
        
        System.out.println("TOTAL CAPITAL CHARS : "+total);
        
        */
    }
}
