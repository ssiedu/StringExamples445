
public class StringComparesStringBuffer {

    public static void main(String[] args) {

        String s1=new String("indore");
        StringBuffer s2=new StringBuffer("indore");
        String s3=s2.toString();
        boolean res=s1.equals(s3);
        System.out.println(res);
        
        
    }
}
