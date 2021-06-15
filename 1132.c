#include<stdio.h>
int main()
{
    int x,y,i,total=0;
    scanf("%d%d",&x,&y);
    if(x>y){
        for(i=y;i<=x;i++)
            if(i%13!=0)
            total+=i;
    }
    else if(x<y){
        for(i=x;i<=y;i++)
            if(i%13!=0)
            total+=i;
    }
    printf("%d\n",total);
    return 0;//end line
}