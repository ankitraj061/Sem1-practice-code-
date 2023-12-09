import java.util.Scanner;

class Solution {
    static boolean isprime(int n) {
        int f = 0;
        for (int a = 1; a <= n; a++)
            if (n % a == 0)
                f++;
        if (f == 2)
            return true;
        else
            return false;

    }

    static int sumdig(int n) {
        int t = n, sum = 0;
        while (t > 0) {
            sum = sum + t % 10;
            t = t / 10;
        }
        return sum;
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = s.nextInt();
        if (isprime(n))
            System.exit(0);
        else {
            int arr1[] = new int[100];
            int arr2[] = new int[100];
            int ind = 0;
            int f = 0, t = n;
            for (int a = 1; a <= n; a++) {
                if (n % a == 0) {
                    if (isprime(a)) {
                        f = 0;
                        t = n;
                        arr1[ind] = a;
                        while (n % a == 0) {
                            f++;
                            t = t / a;
                        }
                        arr2[ind] = f;
                    } 
                }

            }
            double sum = 0;
            for (int a = 0; a <= ind; a++)
                sum = sum + Math.pow(arr1[a], arr2[a]);
            int sumd = sumdig(n);
            if (sumd == sum)
                System.out.println("Yes");
            else
                System.out.println("No");

        }
    }
}