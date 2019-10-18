
import java.util.Scanner;
import java.util.StringJoiner;


public class StringJoinerExample {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the places you have visited recently : ");

        StringJoiner sj=new StringJoiner("<-->","==@","@==");
        
        
        for(int i=1; i<=3; i++){
            System.out.println("Enter Place : "+i);
            String place=sc.next();
            sj.add(place);
        }
        System.out.println(sj);
        
    }
}
