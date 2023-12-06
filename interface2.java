interface TestInterface{
    public void square(int a);
    static void display(){//interface can contain static as well as default methods
        System.out.println("I'm happy");
    }
    default void show(){
        System.out.println("Default method");
    }
    
}
class TestClass implements TestInterface
{
    public void square(int a){
        System.out.println(a*a);

    }  
}
public class interface2 {
    public static void main(String[] args) {
    
        TestInterface obj=new TestClass();
        TestInterface.display();
        obj.square(4);
        obj.show();
        
    }
}
