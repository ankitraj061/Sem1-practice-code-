import java.util.TreeSet;

public class TreeSet1 {
    public static void main(String[] args) {
        TreeSet ts =new TreeSet();
        char d=125;
        System.out.println(d);
        ts.add(100);
        ts.add(50);
        ts.add(150);
        ts.add(25);
        ts.add(75);
        ts.add(125);
        ts.add(175);
        System.out.println(ts);

        System.out.println(ts.higher(50));//75
        System.out.println(ts.lower(50));//25

        System.out.println();
        System.out.println(ts.ceiling(40));
        System.out.println(ts.floor(40));

    }
}
