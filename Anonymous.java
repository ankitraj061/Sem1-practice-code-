public class Anonymous {
    public static void main(String[] args) {
        add(new int[] { 10, 20, 30, 40 }); //anonymous array
        add(new int[] { 10, 20 }); //anonymous array
        add(new int[] {}); //anonymous array

    }

    public static void add(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println("The sum is ::" + sum);
    }
}