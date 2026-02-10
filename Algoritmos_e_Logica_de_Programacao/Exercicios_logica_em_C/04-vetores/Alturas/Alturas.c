// Programa para ler nomes, idades e alturas. Calcular media de idades, quantidades de menores de 16 anos e apresentar o nome dos mesmos na tela.

#include <stdio.h>
#include <string.h>

int main()
{

    int total_pessoas;
    printf("Quantas pessoas serao digitadas? ");
    scanf("%d", &total_pessoas);

    char nomes[total_pessoas][30];
    int idades[total_pessoas];
    double alturas[total_pessoas];
    for (int i = 0; i < total_pessoas; i++) {
        printf("\nDados da %da pessoa: \n", i + 1);
        printf("Nome: ");
        while (getchar() != '\n');
        fgets(nomes[i], 50, stdin);
        printf("Idade: ");
        scanf("%d", &idades[i]);
        printf("Altura: ");
        scanf("%lf", &alturas[i]);
    }

    double soma_alturas = 0;
    int contagem_menores = 0;
    for (int i = 0; i < total_pessoas; i++) {
        soma_alturas += alturas[i];

        if (idades[i] < 16) {
            contagem_menores ++;
        }
    }

    int porcentagem_menores16 = contagem_menores * 100 / total_pessoas;
    double media_alturas = soma_alturas / total_pessoas;
    printf("\nAltura media: %.2lf\n", media_alturas);
    printf("Pessoas com menos de 16 anos: %d%%\n", porcentagem_menores16);

    for (int i = 0; i < total_pessoas; i++) {
        if (idades[i] < 16) {
            printf("%s", nomes[i]);
        }
    }

    return 0;
}
