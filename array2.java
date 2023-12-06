import java.util.Scanner;

public class array2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns of a 2-D array:");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int num[][] = new int[m][n];
        System.out.println("enter the vlaues of " + m + "*" + n + " array:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                num[i][j] = sc.nextInt();
            }
        }
        System.out.println("the entered array:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
    }
}
