#include <stdio.h>

int main(){

    int x, y, soma, troca;
    double media;

    printf("Digite dois numeros:\n");
    scanf("%d", &x);
    scanf("%d", &y);

    if (x > y){
        troca = x;
        x = y;
        y = troca;

    }

    soma = 0;

    for (int i = x+1; i < y; i++){
        if ( i % 2 != 0 ){
        soma = soma + i;
        }
    }

    media = (double)soma / 2;

    printf("Soma dos impares: %d\n", soma);
    printf("Media dos impares: %.2f\n", media);

    return 0;

}

