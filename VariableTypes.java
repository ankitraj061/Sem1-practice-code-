public class A4 {
    // Static variable
    static int staticVariable = 10;

    // Instance variable
    int instanceVariable = 5;

    public void exampleMethod() {
        // Local variable
        int localVariable = 3;

        System.out.println("Static variable: " + staticVariable);
        System.out.println("Instance variable: " + instanceVariable);
        System.out.println("Local variable: " + localVariable);
    }

    public static void main(A5[] args) {
        A4 obj = new A4();
        obj.exampleMethod();
    }
}

