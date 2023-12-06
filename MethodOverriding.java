 class Parent{
    void display1(){
        System.out.println("I'm on parent class");
    }
    protected void display(){
        System.out.println("I'm on parent class2");
    }
}
class Child extends Parent{
    void display(){
        System.out.println("I'm on child class");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
        obj.display1();
        
    }
}
//if the same method present in both parent class and child class the it is called method overriding.