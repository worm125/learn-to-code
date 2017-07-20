#include<stdio.h>

int main()
{
    int size, arr[1000], target,i;
    scanf("%d",&size);
    
    for(i=0;i<size;i++)
    scanf("%d",&arr[i]);
    scanf("%d",&target);
    for(i=1;i<size;i++)
    {
        if(arr[i]<arr[i-1])
        {
            printf("Array should be sorted in ascending");
            return 0;
        }
    }
  
    for(i=0;i<size;i++)
    {
        if(arr[i]>=target)
            break;
    }
    printf("%d",i);
    return 0;
}⁠⁠⁠⁠
