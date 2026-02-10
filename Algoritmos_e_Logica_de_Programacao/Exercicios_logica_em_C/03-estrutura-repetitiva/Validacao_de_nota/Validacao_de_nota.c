#include <stdio.h>

int main()
{
    // recebe a quantidade de notas que serao digitadas
    int quantidade_notas;
    printf("Quantas notas vao ser digitadas? ");
    scanf("%d", &quantidade_notas);

    // Recebe as notas digitadas e compara se está no intervalo de 0 a 10.
    double nota[quantidade_notas];
    for (int i = 0; i < quantidade_notas; i++) {
        do {

            printf("\nDigite a %da nota: ", i + 1);
            scanf("%lf", &nota[i]);

            if (nota[i] < 0 || nota[i] > 10) { // se for invalido informa ao usuario
                printf("Nota invalida! tente novamente.\n\n");
            }

        } while (nota[i] < 0 || nota[i] > 10);
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