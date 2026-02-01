// App para somar numeros de vetores diferentes, recebe os numeros para o vetor A e depois para o vetor B e em sequencia soma os numeros dos vetores (A+B)

#include <stdio.h>

int main()
{

    int total_numeros;

    printf("Quantos valores voce vai digitar em cada vetor? ");
    scanf("%d", &total_numeros);

    printf("Digite os valores do vetor A: \n");
    int vetorA[total_numeros];
    for (int i = 0; i < total_numeros; i++) {
        scanf("%d", &vetorA[i]);
    }

    printf("Digite os valores do vetor B: \n");
    int vetorB[total_numeros];
    for (int i = 0; i < total_numeros; i++) {
        scanf("%d", &vetorB[i]);
    }

    int resultado[total_numeros];
    for (int i = 0; i < total_numeros; i++) {
        resultado[i] = vetorA[i] + vetorB[i];
    }

     printf("Vetor resultante: ");
    for (int i = 0; i < total_numeros; i++) {
        printf("%d\n", resultado[i]);
    }

    return 0;
}