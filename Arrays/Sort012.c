#include <stdio.h>

// Swap function
void swap(int *a, int *b) {
    int temp;
    temp = *a;
    *a = *b;
    *b = temp;
}

int main() {
    int n, i;
    int arr[100];
    int low = 0, mid = 0, high;

    printf("Enter size of array: ");
    scanf("%d", &n);

    printf("Enter array elements (0, 1, 2 only):\n");

    for(i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    high = n - 1;

    while(mid <= high) {

        if(arr[mid] == 0) {
            swap(&arr[low], &arr[mid]);
            low++;
            mid++;
        }

        else if(arr[mid] == 1) {
            mid++;
        }

        else if(arr[mid] == 2) {
            swap(&arr[mid], &arr[high]);
            high--;
        }
    }

    printf("Sorted array:\n");

    for(i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }

    return 0;
}