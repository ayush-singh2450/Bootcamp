#include <stdio.h>

int main() {
    int a[10][10];
    int n, i=0, j=0,p=0;
    int sum1=0,sum2=0,d;
    
    printf("Enter size: ");
    scanf("%d", &n);
    int q=n-1;
    printf("Enter matrix elements:\n");

    for(i = 0; i < n; i++) {
        for(j = 0; j < n; j++) {
            scanf("%d", &a[i][j]);
        }
    }
    while(i<n){
            sum1+=a[i][j];
            i++;
            j++;
    }
    while(i<n)
           sum2+=a[p][q];
           p++;
           q--;
           if(sum1>=sum2)
           d=sum1-sum2;
           else
           d=sum2-sum1;
           printf("Difference = %d",d);
   

    return 0;
}