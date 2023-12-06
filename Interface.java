interface Person
{
    void show();
    default void drive(){
        System.out.println("Driving...");
    }
}
public class Interface {
    public static void main(String[] args) {
        Person obj =new Person()
        //annonymous class which is implementing the interface Person because we can't create the object of interface
        {
            public void show(){
                System.out.println("inside show");
            }
        };
        obj.drive();
        obj.show();
    }
}
