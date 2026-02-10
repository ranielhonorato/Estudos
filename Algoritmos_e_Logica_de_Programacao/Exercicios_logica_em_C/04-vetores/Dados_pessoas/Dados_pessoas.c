#include <stdio.h>

int main()
{

    int total_pessoas;

    printf("Quantas pessoas serao digitadas? ");
    scanf("%d", &total_pessoas);

    double altura_pessoas[total_pessoas];
    char genero_pessoas[total_pessoas];

    for (int i = 0; i < total_pessoas; i++) {
        printf("Altura da %da pessoa: ", i + 1);
        scanf("%lf", &altura_pessoas[i]);
        printf("Genero da %da pessoa: ", i + 1);
        scanf(" %c", &genero_pessoas[i]);
    }

    double menor_altura = altura_pessoas[0], maior_altura = altura_pessoas[0];
    for (int i = 0; i < total_pessoas; i++) {
        if (menor_altura > altura_pessoas[i]) {
            menor_altura = altura_pessoas[i];
        } else if (maior_altura < altura_pessoas[i]) {
            maior_altura = altura_pessoas[i];
        }
    }

    printf("\nMenor altura = %.2lf", menor_altura);
    printf("\nMaior altura = %.2lf", maior_altura);

    double alturas_mulheres = 0;
    int total_mulheres;
    for (int i = 0; i < total_pessoas; i++) {
        if (genero_pessoas[i] == 'f' || genero_pessoas[i] == 'F') {
            alturas_mulheres += altura_pessoas[i];
            total_mulheres++;
        }
    }

    double media_alturas_mulheres = alturas_mulheres / total_mulheres;
    printf("\nMedia das alturas das mulheres = %.2lf", media_alturas_mulheres);

    int total_homens = 0;
    for (int i = 0; i < total_pessoas; i++) {
        if (genero_pessoas[i] == 'm' || genero_pessoas[i] == 'M') {
            total_homens++;
        }
    }

    printf("\nTotal de homens = %d", total_homens);

        return 0;
}