import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList ls = new ArrayList();
        ls.add(10);
        ls.add(2);
        ls.add(17);
        ls.add(11);
        ls.add(5);
        System.out.println(ls);

        
        for(int i=0;i<ls.size();i++){
            Object o=ls.get(i);
            System.out.println(o);
        }
        System.out.println();
        System.out.println();
        //using foreach loop
        for(Object n:ls){
            System.out.println(n);

        }


    }
}
