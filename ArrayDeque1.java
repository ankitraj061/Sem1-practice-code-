import java.util.ArrayDeque;

public class ArrayDeque1 {
    public static void main(String[] args) {
        ArrayDeque ad1=new ArrayDeque();
        ad1.add(100);
        ad1.add(200);
        ad1.add(200);//Duplicate values are allowed in ArrayDeque
        System.out.println(ad1);//index based insertion is not allowed in Deque
        ad1.addFirst("A");
        ad1.addLast("R");
        System.out.println(ad1);

        ad1.offer(0);
        ad1.offerFirst(1);
        ad1.offerLast(2);
        System.out.println(ad1);




    }
}
