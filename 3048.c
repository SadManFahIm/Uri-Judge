#include <stdio.h>

int main(){
    int N, i, j, atual, consecutivos = 0;

    scanf("%d", &N);
    int sequencia[N];
    
    for(i = 0; i < N; i++)
        scanf("%d", &sequencia[i]);
    
    atual = sequencia[0];
    i = 1;
    while(i < N){
        if(atual == 1){
            for(j = i; j < N; j++){
                if(sequencia[j] == 2)
                    break;
            }
            i = j;
            atual = 2;
        }else{
            for(j = i; j < N; j++){
                if(sequencia[j] == 1)
                    break;
            }
            i = j;
            atual = 1;
        }
        consecutivos++;
    }   
    printf("%d\n", consecutivos);

    return 0;
}
