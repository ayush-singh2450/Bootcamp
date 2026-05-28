#include <stdio.h>

int main() {
    int n, i, j, count;
    int arr[20];
    int found = 0;

    scanf("%d", &n);

    for(i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    for(i = 0; i < n; i++) {
        count = 0;

        for(j = 0; j < n; j++) {
            if(arr[i] == arr[j]) {
                count++;
            }
        }

        if(count > n / 4) {
            printf("%d", arr[i]);
            found = 1;
            break;
        }
    }

    if(found == 0) {
        printf("No element appears more than n/4 times");
    }

    return 0;
}