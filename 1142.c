#include <stdio.h>
 
int main()
{
    int x,i=-3;
    scanf("%d",&x);
    while(x--){
            i+=4;
        printf("%d %d %d PUM\n",i,i+1,i+2);
    }
 
    return 0;
}