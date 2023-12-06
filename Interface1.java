interface Computer
{
    void compileCode();
    void runCode();
}
class Desktop implements Computer
{
    public void compileCode(){
        System.out.println("You got 5 error,faster");
    }
    public void runCode(){
        System.out.println("Code is not running in Desktop");
    }
}
class Laptop implements Computer
{
    public void compileCode(){
        System.out.println("You got 5 error");
    }
    public void runCode(){
        System.out.println("Code is not running in Laptop");
    }
}
class Developer
{
	public void buildApplication(Computer obj) {
		System.out.println("I'm building Applocation");
        obj.compileCode();
        obj.runCode();
	}
}

public class Interface1 {
	public static void main(String []hello) {

        Computer obj1=new Laptop();
        Computer obj2=new Desktop();


		Developer obj=new Developer();
        obj.buildApplication(obj1);
		obj.buildApplication(obj2);
		
	}

}
