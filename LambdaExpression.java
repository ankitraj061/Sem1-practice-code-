interface Person
{
    void show(int a);
     default void drive(){
         System.out.println("Driving...");
     }
}
public class LambdaExpression {
    public static void main(String[] args) {
        Person obj = (a)-> System.out.println("Inside show");
        //annonymous class which is implementing the interface Person because we can't create the object of interface(){System.out.println("inside show");
            
        
        obj.show(4);
        obj.drive();
    }
}
