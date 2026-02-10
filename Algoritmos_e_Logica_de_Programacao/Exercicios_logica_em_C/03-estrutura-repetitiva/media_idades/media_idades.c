#include <stdio.h>

int main()
{

    int idade, soma, Idades_Digitadas;
    double media;

    printf("Digite as idade: \n");
    scanf("%d", &idade);

    Idades_Digitadas = 0;
    soma = 0;
    while (idade >= 0) {
        soma = soma + idade;
        Idades_Digitadas = Idades_Digitadas + 1;
        scanf("%d", &idade);
    }

    if (Idades_Digitadas == 0) {
        printf("Impossivel calcular\n");
    } else {
        media = (double)soma / Idades_Digitadas;
        printf("Media = %.2lf\n", media);
    }

    return 0;
}