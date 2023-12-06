class Satyam
{
    void a()
    {
        try{
            b();
        }
        catch(Exception obj){
            System.out.println("Exception Handled");
        }
    }
    void b() throws Exception
    {
            c();
    }
    void c() throws Exception
    {
        int num1=10;
        int num2=0;
        int result=num1/num2;
    }
}
public class DuckingException {
    public static void main(String[] args) {
        Satyam bc = new Satyam();
        bc.a();     
    }
}
