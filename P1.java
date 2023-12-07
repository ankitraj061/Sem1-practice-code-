class Solution {
    int countX(int L, int R, int X) {
        int count = 0;
        int p;
        int digit;
        // code here
        for (int i = L + 1; i < R; i++) {
            p = i;
            while (p > 0) {
                digit = p % 10;
                if (X == digit) {
                    count++;
                }
                p /= 10;

            }
        }
        return count;
    }
}

public class P1 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int result = sol.countX(10, 19, 1);
        System.out.println(result);

    }
}
