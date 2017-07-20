#include<stdio.h>

int main()
{
    int n, arr[1000], t,i;
    scanf("%d",&n);
    
    for(i=0;i<n;i++)
    scanf("%d",&arr[i]);
    scanf("%d",&t);
    for(i=1;i<n;i++)
    {
        if(arr[i]<arr[i-1])
        {
            printf("Array should be sorted in ascending");
            goto end;
        }
    }
  
    for(i=0;i<n;i++)
    {
        if(arr[i]==t)
            break;
        else
        if(arr[i]>t)
            break;
    }
    printf("%d",i);
    end : return 0;
}⁠⁠⁠⁠
