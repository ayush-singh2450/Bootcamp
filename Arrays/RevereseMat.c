#include <stdio.h>

int main() {
    int a[10][10], row, col;
    int i, j, temp;

    printf("Enter number of rows and columns: ");
    scanf("%d %d", &row, &col);

    printf("Enter matrix elements:\n");
    for(i = 0; i < row; i++) {
        for(j = 0; j < col; j++) {
            scanf("%d", &a[i][j]);
        }
    }
    // Reverse each row
    for(i = 0; i < row; i++) {
        for(j = 0; j < col / 2; j++) {
            temp = a[i][j];
            a[i][j] = a[i][col - 1 - j];
            a[i][col - 1 - j] = temp;
        }
    }

    printf("Matrix after reversing each row:\n");

    for(i = 0; i < row; i++) {
        for(j = 0; j < col; j++) {
            printf("%d ", a[i][j]);
        }
        printf("\n");
    }

    return 0;
}