#include<stdio.h>
int main()
{
    int x,a=0,b=0,c=0;
    while(scanf("%d",&x)){
        if(x==1){
            a++;
        }
        if(x==2){
            b++;
        }
        if(x==3){
            c++;
        }
        if(x==4){
            break;
        }
    }
    printf("MUITO OBRIGADO\n");
        printf("Alcool: %d\n",a);
        printf("Gasolina: %d\n",b);
        printf("Diesel: %d\n",c);
    return 0;//end line
}