#include <stdio.h>

int main() {
    int a[50],prefix[50];
    int n,i,l,r;
    printf("Enter size of array:\n");
    scanf("%d",&n);
    
    printf("Enter elements:\n ");
    for(i=0;i<n;i++){
        scanf("%d",&a[i]);
    }
    prefix[0]=0;
    for(int i=1;i<=n;i++){
        prefix[i]=prefix[i-1]+a[i-1];
    }
    printf("Enter ranges:\n");
    scanf("%d %d",&l,&r);
    
    int sum=prefix[r]-prefix[l-1];
    printf("Sum = %d",sum);
    return 0;
}