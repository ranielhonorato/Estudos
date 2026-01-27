#include <stdio.h>

int main()
{

    int n;
    printf("Quantos numeros voce vai digitar? ");
    scanf("%d", &n);

    double vet[n];

    for (int i = 0; i < n; i++)
    {
        printf("Digite um numero: ");
        scanf("%lf", &vet[i]);
    }

    double soma = 0;
    for (int i = 0; i < n; i++)
    {
        soma = soma + vet[i];
    }
    double media = soma / n;

    printf("Valores = ");
    for (int i = 0; i < n; i++)
    {
        printf("%.2lf ", vet[i]);
    }

    printf("\nSoma = %.2lf", soma);
    printf("\nMedia = %.2lf", media);

    return 0;
}
