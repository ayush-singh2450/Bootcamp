#include <stdio.h>

int main() {
    int a[10][10];
    int n, i, j;

    printf("Enter order of matrix: ");
    scanf("%d", &n);

    printf("Enter matrix elements:\n");

    for(i = 0; i < n; i++) {
        for(j = 0; j < n; j++) {
            scanf("%d", &a[i][j]);
        }
    }

    printf("Matrix after 180 degree rotation:\n");

    for(i = n - 1; i >= 0; i--) {
        for(j = n - 1; j >= 0; j--) {
            printf("%d ", a[i][j]);
        }
        printf("\n");
    }
    return 0;
}