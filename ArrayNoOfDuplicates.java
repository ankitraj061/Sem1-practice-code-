import java.util.Scanner;

public class ArrayNoOfDuplicates {
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
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr1[i] == arr1[j]) {
                    count++;
                    break;
                }

            }
        }
        System.out.println("the no of duplicate values are: " + count);
    }
}

// count no. of duplicate values
