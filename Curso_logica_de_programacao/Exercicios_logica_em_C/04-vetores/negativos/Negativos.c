// Programa para ler numeros menores ou igual a 10 e apresentar os numeros negativos digitados ao final.
// Regra de negócio: Caso o usuario digite um numero maior que 10, repete o loop ignorando a tentativa até o usuario digitar um valor valido.

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

        if (numeros[i] > 10) {
            printf("Tentativa invalida! Digite apenas numeros menores ou igual a 10.\n");
            i--;
            continue;
        }
    }

    printf("Numeros negativos: \n");
    for (int i = 0; i < casos; i++) {
        if (numeros[i] < 0) {
            printf("%d\n", numeros[i]);
        }
    }

    return 0;
}