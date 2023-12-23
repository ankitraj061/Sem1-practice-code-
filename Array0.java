import java.util.Scanner;

class Solution {
    public int[] removeDuplicate(int a[]) {

        int n = a.length;
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    for (int k = j; k < n - 1; k++) {
                        temp = a[k];
                        a[k] = a[k + 1];
                        a[k + 1] = temp;
                    }
                    n--;
                    j--;

                }
            }
        }
        int b[] = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = a[i];
        }

        return b;
    }

    public int display(int[] a, int n, int k) {
        int sum = 0;
        int removeDuplicateArray[] = removeDuplicate(a);
        for (int i = 0; i < removeDuplicateArray.length; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (removeDuplicateArray[i] == a[j]) {
                    count++;
                }

            }
            if (n / k < count) {
                sum = sum + (count - n / k);

            }

        }
        return sum;

    }

}

class Array0 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the length of array:");
        int length = s.nextInt();

        int arr[] = new int[length];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < length; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("Enter the value of K:");
        int k = s.nextInt();

        Solution st = new Solution();
        int result = st.display(arr, length, k);
        System.out.println(result);

    }
}