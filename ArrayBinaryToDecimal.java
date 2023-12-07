import java.util.Scanner;
//import java.math;

public class ArrayBinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array1[] = new int[4];
        for (int i = 0; i < 4; i++) {

            System.out.print("Enter the " + i + "th index value:");
            array1[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 3; i >= 0; i--) {
            if (array1[i] == 1) {
                sum = sum + (array1[i] * (int) Math.pow(2, 3 - i));

            }
        }
        System.out.println(sum);
    }
}
