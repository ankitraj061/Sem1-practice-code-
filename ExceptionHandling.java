public class ExceptionHandling
{
    public static void main(String[] args) {
        try{
            System.out.println("indide try block ");
            System.out.println(10/0);
        }
        catch(NullPointerException e){
            System.out.println("Exception Handled");

        }
        finally{
            System.out.println("finally block");
        }
    }
}