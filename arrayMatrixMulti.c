#include <stdio.h>
void multiplyMatrix(int a[10][10], int b[10][10], int c[10][10], int m, int n, int p)
{
    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < n; j++)
        {
            c[i][j] = 0;
            for (int k = 0; k < p; k++)
            {
                c[i][j] = a[i][k] * b[k][j];
            }
        }
    }
}
int main()
{
    int m, n, p;
    printf("Enter the row number of matrix A :");
    scanf("%d", &m);
    printf("\nEnter the column number of matrix A (and row number of matrix B) :");
    scanf("%d", &n);
    printf("\nEnter the column number of matrix B :");
    scanf("%d", &p);
    int A[m][n], B[n][p], C[m][p];

    //taking elements input of Matrix A
    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < n; j++)
        {
            printf("Enter the value of a[%d][%d]", i + 1, j + 1);
            scanf("%d", &A[i][j]);
        }
    }

    //taking elements input of matrix B
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < p; j++)
        {
            printf("Enter the value of b[%d][%d]", i + 1, j + 1);
            scanf("%d", &B[i][j]);
        }
    }

    //calling multiplyMatrix function
    multiplyMatrix(A, B, C, m, n, p);


    //Printing matrix multiplication
    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < p; j++)
        {
            printf("%d", C[i][j]);
            printf(" ");
        }
        printf("\n");
    }
}