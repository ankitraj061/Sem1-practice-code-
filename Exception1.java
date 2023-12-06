class Simple
{
    void a() 
    {
        int data=6/0;
    }
    void b()
    {
        a();
    }
    public void c()
    {
        try{
            b();
        }
        catch(Exception obj){
            System.out.println("Can't divide a number with Zero");
        }
    }
}
public class Exception1 {
    public static void main(String[] args) {
        Simple s= new Simple();
        s.c();
        System.out.println("Normal flow.....");
        
    }
}
