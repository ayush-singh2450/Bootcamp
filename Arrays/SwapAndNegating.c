#include <stdio.h>

int main() {
    int r, c, i, j, temp;
    int a[10][10];

    scanf("%d %d", &r, &c);

    for(i = 0; i < r; i++) {
        for(j = 0; j < c; j++) {
            scanf("%d", &a[i][j]);
        }
    }

    for(j = 0; j < c; j++) {
        temp = a[0][j];
        a[0][j] = a[r-1][j];
        a[r-1][j] = temp;
    }

    for(i = 0; i < r; i++) {
        for(j = 0; j < c; j++) {
            if(i % 2 == 0) {
                a[i][j] = -a[i][j];
            }
        }
    }
    for(i = 0; i < r; i++) {
        for(j = 0; j < c; j++) {
            printf("%d ", a[i][j]);
        }
        printf("\n");
    }

    return 0;
}