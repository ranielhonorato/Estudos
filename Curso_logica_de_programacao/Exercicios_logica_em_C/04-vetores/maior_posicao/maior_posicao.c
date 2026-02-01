// App para ler os numeros e mostrar o maior numero e a sua posição do maior

#include <stdio.h>

int main()
{

    int casos;
    printf("Quantos numeros voce vai digitar? ");
    scanf("%d", &casos);

    double numeros[casos];
    for (int i = 0; i < casos; i++) {
        printf("Digite um numero: ");
        scanf("%lf", &numeros[i]);
    }

    double maior_numero = 0, posicao_maior = 0;
    for (int i = 0; i < casos; i++) {
        if (maior_numero < numeros[i]) {
            maior_numero = numeros[i];
            posicao_maior = i+1;
        }
    }

    printf("\nMaior valor = %.1lf", maior_numero);
    printf("\nPosicao do maior valor = %.1lf", posicao_maior);

    return 0;
}