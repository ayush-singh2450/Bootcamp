#include <stdio.h>

int main() {
    int n, i, min, pos;

    printf("Enter number of elements: ");
    scanf("%d", &n);

    int arr[n];
    printf("Enter array elements:\n");
    for(i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    min = arr[0];
    pos = 0;

    for(i = 1; i < n; i++) {
        if(arr[i] < min) {
            min = arr[i];
            pos = i;
        }
    }
    for(i = pos; i < n - 1; i++) {
        arr[i] = arr[i + 1];
    }

    n--;

    printf("Array after deleting smallest element:\n");

    for(i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }

    return 0;
}