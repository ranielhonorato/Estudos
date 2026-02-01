#include <stdio.h>

int main()
{

    int casos;
    printf("Quantos numeros voce vai digitar? ");
    scanf("%d", &casos);

    printf("\n");

    double numeros[casos];
    for (int i = 0; i < casos; i++) {
        printf("Digite um numero: ");
        scanf("%lf", &numeros[i]);
    }

    double soma = 0;
    printf("\nValores = ");
    for (int i = 0; i < casos; i++) {
        printf("%.1lf ", numeros[i]);
        soma += numeros[i];
    }

    double media = soma / casos;
    printf("\nsoma = %.2lf\n", soma);
    printf("Media = %.2lf", media);

    return 0;
}