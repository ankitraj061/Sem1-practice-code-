import java.util.Scanner;

public class ArrayOccrenceOfInteger {
    public static void main(String[] args) {

        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        n = sc.nextInt();

        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter " + (i + 1) + "th value:");
            arr1[i] = sc.nextInt();
        }


        System.out.println("Enter a digit:");
        int num1 = sc.nextInt();


        int p, count = 0;
        int digit;
        for (int i = 0; i < arr1.length; i++) {
            p = arr1[i];
            while (p > 0) {
                digit = p % 10;
                if (digit == num1) {
                    count++;
                }
                p /= 10;
            }
        }
        System.out.println("The digit " + num1 + " occures " + count + " times in Array.");
    }
}

// find occurence of an integer in array