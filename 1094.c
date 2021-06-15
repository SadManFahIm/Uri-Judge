#include<stdio.h>
int main()
{
    int n,x,i;
    long int total=0,t_c=0,t_r=0,t_s=0;
    float c,r,s;
    char ch;
    scanf("%d",&n);
    for(i=1;i<=n;i++){
        scanf("%d %c",&x,&ch);
        total=total+x;
    if(ch=='C')
        t_c+=x;
    else if(ch=='R')
        t_r+=x;
    else if(ch=='S')
        t_s+=x;
    }
    c=(float)t_c/(float)total*100;
    r=(float)t_r/(float)total*100;
    s=(float)t_s/(float)total*100;
    printf("Total: %d cobaias\n",total);
    printf("Total de coelhos: %d\n",t_c);
    printf("Total de ratos: %d\n",t_r);
    printf("Total de sapos: %d\n",t_s);
    printf("Percentual de coelhos: %.2f %\nPercentual de ratos: %.2f %\nPercentual de sapos: %.2f %\n",c,r,s);
    return 0;//end line
}