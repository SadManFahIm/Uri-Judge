#include<stdio.h>
 
int main()
{
    int x,a,b,i;
    scanf("%d",&x);
    for(i=1;i<=x;i++){
    a=(i*i);
    b=(i*i*i);
    printf("%d %d %d\n",i,a,b);
    }
    return 0;//end line
}