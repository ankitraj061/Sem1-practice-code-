
class MethodOverloading {
    public void property(int a) {
        System.out.println( a);
        System.out.println("int args method");

    }

    public void property(Double a) {
        System.out.println( a);
        System.out.println("double args method");
    }

    public void property(String a) {
        System.out.println(a);
        System.out.println("String args method");
    }

    public void property(int a, int b) {
        System.out.println(a + " " + b);
        System.out.println("int args method");
    }
}

public class A3 {
    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        obj.property(5);
        obj.property("ankit");
        obj.property(3.555);
        obj.property(0, 122);
    }

}
