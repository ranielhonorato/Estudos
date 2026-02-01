// App para ler os numeros digitados, imprimir o resultado da media e os valores abaixo da média na tela

#include <stdio.h>

int main()
{

    int tamanho_vetor;

    printf("Quantos elementos vai ter o vetor? ");
    scanf("%d", &tamanho_vetor);

    double numeros[tamanho_vetor];
    for (int i = 0; i < tamanho_vetor; i++) {
        printf("Digite um numero: ");
        scanf("%lf", &numeros[i]);
    }

    double soma = 0;
    for (int i = 0; i < tamanho_vetor; i++) {
        soma += numeros[i];
    }

    double media = soma / tamanho_vetor;
    printf("\nMedia do vetor = %.3lf", media);

    printf("\nElementos abaixo da media: \n");
    double abaixo_media[tamanho_vetor];
    for (int i = 0; i < tamanho_vetor; i++) {
        if (numeros[i] < media) {
            abaixo_media[i] = numeros[i];
            printf("%.1lf\n", abaixo_media[i]);
        }
    }

    return 0;
}