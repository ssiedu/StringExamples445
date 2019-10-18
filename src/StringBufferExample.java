
public class StringBufferExample {
    public static void main(String[] args) {
        //StringBuffer sb=new StringBuffer("abcdefgh");
        StringBuilder sb=new StringBuilder("abcdefgh");
        System.out.println(sb);
        //sb.append("XYZ");
        //sb.insert(0, "XYZ");
        //sb.replace(1, 4, "XYZ");
        //sb.setLength(12);
        //sb.setCharAt(3, 'Z');
        //sb.deleteCharAt(3);
        //sb.delete(1, 5);
        sb.reverse();
        System.out.println(sb);
       
        String s=sb.toString();
        s=s.toUpperCase();
        System.out.println(s);
        
    }
}
/*
    StringBuffer(String)
    ------------------------

    append  //adding at the end
    insert  //adding new contents on desired position
    replace //replaces a range of chars with new contents
    setLength   //will change the length of StringBuffer
    setCharAt   //sets the new char on given index
    deleteCharAt  //  deletes the char on given index
    delete      //deletes a range
    reverse     //reverse the order of charaters
    toString    //convert a StringBuffer to String

*/