#include<stdio.h>
 
int main()
{
    int i=1,j=60;
    for(i=1,j=60;j<=60;j=j-5,i=i+3){
    printf("I=%d J=%d\n",i,j);
    if(j==0)
    break;
    }
    return 0;//end line
}