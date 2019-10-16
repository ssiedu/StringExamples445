
import java.util.Scanner;


public class UserAuth {

    public static void main(String[] args) {
        String id="indore";
        String pw="india";
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Userid   : ");
        String s1=sc.next();
        System.out.println("Enter Your Password : ");
        String s2=sc.next();
        
        if(id.equalsIgnoreCase(s1)){
            if(pw.equals(s2)){
                System.out.println("Welcome User....!");
            }else{
                System.out.println("Invalid Password");
            }
        }else{
            System.out.println("Invalid Userid");
        }
        
        
        
        
        
    }
}
