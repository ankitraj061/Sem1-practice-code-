package GoodQuestions;

import java.util.Scanner;

class smithNumber1 {
    public boolean isPrime(int x) {
        int flag = 0;
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                flag++;
            }

        }
        if (flag == 0)
            return true;
        else
            return false;
    }
}

public class smithNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        smithNumber1 sm = new smithNumber1();
        System.out.println("Enter a number :");
        int num1 = s.nextInt();
        int sum = 0;
        while (num1 > 0) {

            for (int i = 2; i <= Math.sqrt(num1); i++) {
                if (num1 % i == 0) {

                    if (sm.isPrime(i)) {
                        System.out.println(i);
                        continue;

                    }
                    num1 /= i;

                }

            }
        }

        // System.out.println(sum);
    }

}
