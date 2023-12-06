public class String2 {
    public static void main(String[] args) {
        StringBuffer s1=new StringBuffer("ankit");
        System.out.println(s1.hashCode());
        s1=s1.append(" raj");
        System.out.println(s1.hashCode());
        
        
        StringBuilder s2=new StringBuilder("hello");
        System.out.println(s1.hashCode());
        s2=s2.append(" world");
        System.out.println(s1.hashCode());

    }
}
