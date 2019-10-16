public class StringConstructorsDemo {
    
    public static void disp(String s){
        System.out.println(s);
    }
    
    public static void main(String[] args) {

        String s1=new String("abcd");
        char ch[]={'a','b','c','d','e','f','g','h','i','j'};
        byte b[]={65,66,67,68,69,70,71,72,73,74,75,76};
        String s2=new String(ch);
        String s3=new String(ch,3,2);
        String s4=new String(b);
        String s5=new String(b,1,5);
        String s6=new String();
        disp(s1);
        disp(s2);
        disp(s3);
        disp(s4);
        disp(s5);
        disp(s6);
    }
}
/*
    String()
    String(String)
    String(char[])
    String(char[],int,int)
    String(byte[])
    String(byte[],int,int)
*/
