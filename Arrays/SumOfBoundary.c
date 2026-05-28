#include <stdio.h>

int main() {
    int a[10][10], rows, cols;
    int i, j, sum = 0;

    printf("Enter number of rows and columns: ");
    scanf("%d %d", &rows, &cols);

    printf("Enter matrix elements:\n");

    for(i = 0; i < rows; i++) {
        for(j = 0; j < cols; j++) {
            scanf("%d", &a[i][j]);
        }
    } 
    for(i = 0; i < rows; i++) {
        for(j = 0; j < cols; j++) {      
            if(i == 0 || i == rows - 1 || j == 0 || j == cols - 1) {
                sum = sum + a[i][j];
            }
        }
    }
    printf("Sum of boundary elements = %d", sum);

    return 0;
}