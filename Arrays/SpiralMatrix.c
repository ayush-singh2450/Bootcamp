#include <stdio.h>

int main() {
    int a[10][10];
    int r, c, i, j;

    int top = 0, bottom, left = 0, right;

    printf("Enter rows and columns: ");
    scanf("%d %d", &r, &c);

    bottom = r - 1;
    right = c - 1;

    printf("Enter matrix elements:\n");

    for(i = 0; i < r; i++) {
        for(j = 0; j < c; j++) {
            scanf("%d", &a[i][j]);
        }
    }

    printf("Spiral order:\n");

    while(top <= bottom && left <= right) {

        for(i = left; i <= right; i++) {
            printf("%d ", a[top][i]);
        }
        top++;

        for(i = top; i <= bottom; i++) {
            printf("%d ", a[i][right]);
        }
        right--;

        if(top <= bottom) {
            for(i = right; i >= left; i--) {
                printf("%d ", a[bottom][i]);
            }
            bottom--;
        }

        if(left <= right) {
            for(i = bottom; i >= top; i--) {
                printf("%d ", a[i][left]);
            }
            left++;
        }
    }

    return 0;
}