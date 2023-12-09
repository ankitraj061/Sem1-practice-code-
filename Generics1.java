class Gen<T> {
    T obj;

    public Gen(T obj) {
        this.obj = obj;

    }

    void display() {
        System.out.println("This type of data is " + obj.getClass().getName());
    }

    public T getObj() {
        return obj;
    }

}

public class Generics1 {
    public static void main(String[] args) {
        Gen<Integer> g = new Gen<Integer>(13);
        g.display();
        System.out.println(g.getObj());

    }
}
