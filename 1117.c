#include <stdio.h>
 
int main()
{
    float x,y,media,a,b;
    while(scanf("%f",&x)){
        if(x<0||x>10){
            printf("nota invalida\n");
        }
        else if(x>=0||x<=10){
            a=x;
            break;
        }
    }
    while(scanf("%f",&y)){
        if(y<0||y>10){
            printf("nota invalida\n");
        }
        else if(y>=0||y<=10){
            b=y;
            break;
        }
    }
    media=(a+b)/2.0;
    printf("media = %.2f\n",media);
    return 0;//end line
}