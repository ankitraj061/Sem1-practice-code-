import java.util.Scanner;

public class QlespYear {
    static int checkLeap(int year) {
        if ((year % 400 == 0 || year % 100 != 0) && year % 4 == 0) {
            return 1;

        } else
            return 0;

    }

    public static void main(String[] args) {
        System.out.println("Enter an Year :");
        Scanner s = new Scanner(System.in);
        int year = s.nextInt();
        QlespYear qy = new QlespYear();
        int result = checkLeap(year);
        if(result==1) System.out.println("Leap Year");
        else System.out.println("Not Leap year");


    }
}
