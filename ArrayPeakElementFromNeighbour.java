import java.util.Scanner;

public class ArrayPeakElementFromNeighbour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int N = sc.nextInt();
        int array[] = new int[N];
        for (int i = 0; i < N; i++) {

            System.out.println("Enter the " + i + "th index value:");
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            if (i == 0 && array[i] > array[i + 1]) {

                System.out.println(array[i] + " is the Peak greater number");
            } else if (i == (N - 1) && array[N - 2] < array[N - 1]) {
                System.out.println(array[N - 1] + " is the Peak greater number");
            } else if (i != 0 && i != (N - 1) && array[i] > array[i + 1] && array[i] > array[i - 1]) {
                System.out.println(array[i] + " is the Peak greater number");
            }

        }
    }
}
