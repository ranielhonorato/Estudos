#include <stdio.h>

int main()
{

    int ordem_matriz;

    printf("Qual a ordem da matriz? ");
    scanf("%d", &ordem_matriz);

    int elemento_matriz[ordem_matriz][ordem_matriz];

    for (int i = 0; i < ordem_matriz; i++) {
        for (int j = 0; j < ordem_matriz; j++) {
            printf("Elemento [%d,%d]: ", i, j);
            scanf("%d", &elemento_matriz[i][j]);
        }
    }

    for (int i = 0; i < ordem_matriz; i++) {
        printf("%d ", elemento_matriz[i][i]);
    }

    int quantidade_negativos = 0;
    for (int i = 0; i < ordem_matriz; i++) {
        for (int j = 0; j < ordem_matriz; j++) {
            if (elemento_matriz[i][j] < 0) {
                quantidade_negativos++;
            }
        }
    }

    printf("\nQuantidade de numeros negativos %d: ", quantidade_negativos);

    return 0;
}