
public class StringMethodsTwo {
    
    public static int countCapital(String s){
        //code
        int total=0;
        //count
        return total;
    }
    public static boolean isCapital(char ch){
        if(ch>=65 && ch<=90){
            return true;
        }else{
            return false;
        }
    }
    
    
    public static void main(String[] args) {
        //String s="this is java code and java is powerful";
        
        //int idx=s.indexOf('j',25);
        //int idx=s.indexOf("is",15);
        
       // System.out.println(idx);
       
       //char ch=s.charAt(90);
       //System.out.println(ch);
        String s="THIS IS JAVA";
        
        
        byte b[]=s.getBytes();
        for(byte tmp:b){
            System.out.println(tmp);
        }
        /*
        char ch[]=s.toCharArray();
        for(char tmp:ch){
            System.out.println(tmp);
        }
        */
        boolean res=isCapital('z');
        System.out.println(res);
        
        
    }
}
/*
    int indexOf(char)       //starts search from idx 0
    int indexOf(char,int)   //starts search from given idx
    int indexOf(String)
    int indexOf(String,int)
    char charAt(int)
    char[] toCharArray()
    byte[] getBytes()

*/
