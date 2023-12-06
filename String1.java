public class String1 {
    public static void main(String[] args) {
        String s1 = "Ankit";
        System.out.println("s1 hashCode() when referencing the object containing 'Ankit'"+s1.hashCode());
        String s2= "Ankit";//both s1 and s2 refers the same object Ankit
        System.out.println("s2 hashCode() when referencing the object containing 'Ankit'"+s1.hashCode());
        //String s1="Hello";//s1 can't able to refer a new object
        s1=s1.concat(" Raj");
        System.out.println("s1 hashCode() when referencing the object containing 'Ankit raj'"+s1.hashCode());
        String s3 =new String("Ankit");
        

        System.out.println(s1==s3);//'false' because both s1 refers the object in SCP and  s3 refers the object in the heap
        


        System.out.println(s1);
        System.out.println(s2.hashCode()); 
        System.out.println(s3.hashCode());
    }
}