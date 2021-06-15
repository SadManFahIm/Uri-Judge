#include <stdio.h>
 
int main()
{
    int n,i,j,k,a,b,c;
    scanf("%d",&n);
    for(i=1,j=1,k=1;i<=n,j<=(n*n),k<=(n*n*n);i++,j=(i*i),k=(i*i*i)){
        a=i;
        b=j+1;
        c=k+1;
            printf("%d %d %d\n%d %d %d\n",i,j,k,a,b,c);
 
    }
    return 0;//end line
}