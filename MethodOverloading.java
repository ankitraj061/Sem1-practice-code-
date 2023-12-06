public class MethodOverloading {
    public void m1(String s) {
        System.out.println("String method :");

    }

    public void m1(Object a) {
        System.out.println("Object  method :");
    }

    public static void main(String[] args) {
        MethodOverloading t = new MethodOverloading();
        t.m1("ankit");
        t.m1(new Object());
        t.m1(null);

    }

}
