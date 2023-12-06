public class String6 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer(150);
        System.out.println(sb.capacity());// 150
        sb.append("java");

        System.out.println(sb);//java
        System.out.println(sb.capacity()); // 150
        sb.trimToSize();
        System.out.println(sb.capacity()); // 4
        

        System.out.println(sb.reverse());// avaj
    }

}
