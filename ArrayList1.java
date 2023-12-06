import java.util.ArrayList;

public class ArrayList1{
    public static void main(String[] args) {
        ArrayList al1=new ArrayList();
        al1.add(100);
        al1.add("Ankit");
        al1.add('P');
        al1.add(2,"Pw Skills");
        System.out.println(al1);

        System.out.println("--------------------");

        ArrayList al2=new ArrayList();
        al2.add(1);
        al2.add(2);
        al2.add(3);
        al2.add(al1);
        al2.addAll(al1);
        System.out.println(al2);

    }

}