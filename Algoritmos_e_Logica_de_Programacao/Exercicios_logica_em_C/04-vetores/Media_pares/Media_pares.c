#include <stdio.h>

int main()
{

    int tamanho_vetor;

    printf("Quantos elementos vai ter o vetor? ");
    scanf("%d", &tamanho_vetor);

    int numeros_vetor[tamanho_vetor];
    for (int i = 0; i < tamanho_vetor; i++) {
        printf("Digite um numero: ");
        scanf("%d", &numeros_vetor[i]);
    }

    int soma_pares = 0, numeros_pares = 0;
    for (int i = 0; i < tamanho_vetor; i++) {
        if (numeros_vetor[i] % 2 == 0) {
            soma_pares += numeros_vetor[i];
            numeros_pares++;
        }
    }

    if (numeros_pares > 0) {
        int media_pares = soma_pares / numeros_pares;
        printf("Media dos pares: %d\n", media_pares);
    } else {
        printf("Nenhum numero par");
    }

    return 0;
}