#include <stdio.h>

int main() {
    int arr[100];
    int n, i;
    int right;

    printf("Enter size of array: ");
    scanf("%d", &n);

    printf("Enter array elements:\n");

    for(i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    printf("Leaders:\n");

    right = arr[n - 1];
    printf("%d ", right);

    for(i = n - 2; i >= 0; i--) {

        if(arr[i] > right) {
            right = arr[i];
            printf("%d ", arr[i]);
        }
    }

    return 0;
}