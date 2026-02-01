// Le os numeros digitados pelo usuario e informa quais sao pares e mostra os numeros pares e o total na tela.

#include <stdio.h>

int main()
{

    int casos;

    printf("Quantos numeros voce vai digitar? ");
    scanf("%d", &casos);

    int numeros[casos];
    for (int i = 0; i < casos; i++) {
        printf("Digite um numero: ");
        scanf("%d", &numeros[i]);
    }

    printf("\nNumeros pares: \n");
    int total_pares = 0;
    for (int i = 0; i < casos; i++) {
        if (numeros[i] % 2 == 0) {
            printf("%d ", numeros[i]);
            total_pares++;
        }
    }

    printf("\n\nQuantidade pares = %d", total_pares);

    return 0;
}