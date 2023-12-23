class Remove {
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
}

class ArrayUnionOfTwo {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 3, 3, 3, 5, 3, 1, 3, 4, 7, 9 };
        int b[] = { 2, 4, 5, 1, 9, 6, 3, 5, 2, 8 };
        Remove r = new Remove();

        int union[] = new int[a.length + b.length];
        System.arraycopy(a, 0, union, 0, a.length);
        System.arraycopy(b, 0, union, a.length, b.length);

        int[] result = r.removeDuplicate(union);

        for (int i = 0; i < result.length; i++)
            System.out.print(result[i] + " ");
    }
}

// find union of two array