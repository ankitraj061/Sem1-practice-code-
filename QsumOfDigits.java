import java.util.Scanner;

class sumOfDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number :");
        int num = scan.nextInt();
        int sum = 0, r;
        for (int i = 0; i <= num; i++) {
            r = num % 10;
            num = num / 10;
            sum = sum + r;

        }
        System.out.println("the sum of digits of entered number is : " + sum);
        scan.close();
    }

}
// enter a number and print sum of its digits
