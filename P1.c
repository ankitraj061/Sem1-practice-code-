
#include <stdio.h>

int main() {
    int N;
    printf("Enter the number of integers (N): ");
    scanf("%d", &N);

    if (N <= 0) {
        printf("Invalid input for N. Please enter a positive integer.\n");
        return 1; 
    }

    int number, largest, smallest;
    printf("Enter %d integers:\n", N);
    scanf("%d", &number);

    largest = smallest = number;

    for (int i = 1; i < N; ++i) {
        scanf("%d", &number);

        if (number > largest) {
            largest = number;
        }
        if (number < smallest) {
            smallest = number;
        }
    }


    printf("The largest value is %d, and the smallest value is %d.", largest,smallest);
    

    return 0;
}