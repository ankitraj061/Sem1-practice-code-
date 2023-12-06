
class InnerConstructor1 {
    InnerConstructor1(double d){
        System.out.println("we are in double argument constructor");
    }
    InnerConstructor1(int d){
        
        System.out.println("we are in int argument constructor");
    }
    InnerConstructor1(){
        
        System.out.println("we are in no argument constructor");
    }
    

    
}
public class Constructor1 {
    public static void main(String[] args) {
        InnerConstructor1 obj = new InnerConstructor1();
        InnerConstructor1 obj1 = new InnerConstructor1(10);
        InnerConstructor1 obj2 = new InnerConstructor1(10.5);
        
    }
}
