#include <stdio.h>

int main()
{
    // recebe a quantidade de notas que serao digitadas
    int quantidade_notas;
    printf("Quantas notas vao ser digitadas? ");
    scanf("%d", &quantidade_notas);

    // loop para receber notas digitadas pelo usuario
    double nota[quantidade_notas];
    for (int i = 0; i < quantidade_notas; i++) {
        printf("Digite a %da nota: ", i + 1);
        scanf("%lf", &nota[i]);
    }

    // loop para somar as notas
    double soma_notas = 0;
    for (int i = 0; i < quantidade_notas; i++) {
        soma_notas += nota[i];
    }

    // Mostra na tela a media das notas digitadas
    double media = soma_notas / quantidade_notas;
    printf("Media = %.2lf", media);

    return 0;
}