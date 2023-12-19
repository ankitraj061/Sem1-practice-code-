import java.util.Scanner;

class FabonacciSeries {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = s.nextInt();
        int lastvalue = 0;
        int secondLast = 1;
        int fabi = 0;
        for (int i = 0; i < n; i++) {
            System.out.print(fabi + ",");

            lastvalue = secondLast;
            secondLast = fabi;

            fabi = lastvalue + secondLast;
        }
    }

}

// 0,1,1,2,3,5,8,13,21,34....n times