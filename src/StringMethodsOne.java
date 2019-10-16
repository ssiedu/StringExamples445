
public class StringMethodsOne {
    public static void main(String[] args) {

        String s1=new String("indore");
        String s2=new String("Indore");
        
        int n=s2.compareToIgnoreCase(s1);
        System.out.println(n);
        /*
        boolean b1=(s1==s2);
        boolean b2=s1.equalsIgnoreCase(s2);
        
        System.out.println(b1);
        System.out.println(b2);
        */
        /*
        String s="this is java";
        int n=s.length();
        System.out.println(n);
        */
        
    }
}
/*
    int length()
    boolean equals(String)
    boolean equalsIgnoreCase(String)
    boolean startsWith(String)
    boolean endsWith(String)
    int compareTo(String)







*/
