import java.util.Scanner;

public class Array7 {
    public static void main(String[] args) {
        System.out.println("Enter the length of the Array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("Enter " + n + " elements of Array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println();
                    count++;
                    // System.out.print(arr[j] + " ");
                    // break;
                }

            }
        }
        System.out.println(count - 1 + " duplicates are avalible.");

    }
}
