
import java.util.Scanner;

public class IndentifyFileType {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter File Name : ");
        String name=sc.next();
        
        if(name.endsWith(".txt")){
            System.out.println("Text File");
        }else if(name.endsWith(".bmp")){
            System.out.println("Image File");
        }else if(name.endsWith(".xlsx")){
            System.out.println("Excel File");
        }else if(name.endsWith(".docx")){
            System.out.println("Word File");
        }else{
            System.out.println("Unknown File");
        }
        
    }
}
