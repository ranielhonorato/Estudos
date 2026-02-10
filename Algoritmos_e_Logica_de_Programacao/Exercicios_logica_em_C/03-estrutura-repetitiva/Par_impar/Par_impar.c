#include <stdio.h>

int main()
{

    int Quantidade_inteiros;

    printf("Quantos numeros voce vai digitar? ");
    scanf("%d", &Quantidade_inteiros);

    int numeros_inteiros;
    for (int i = 0; i < Quantidade_inteiros; i++) {
        printf("Digite um numero: ");
        scanf("%d", &numeros_inteiros);

        if (numeros_inteiros % 2 == 0 && numeros_inteiros > 0) {
            printf("Par positivo\n");
        } else if (numeros_inteiros % 2 == 0 && numeros_inteiros < 0) {
            printf("Par negativo\n");
        } else if (numeros_inteiros % 2 != 0 && numeros_inteiros > 0) {
            printf("Impar positivo\n");
        } else if(numeros_inteiros % 2 != 0 && numeros_inteiros < 0) {
            printf("Impar negativo\n");
        } else{
            printf("Nulo\n");
        }
    }

    return 0;
}