#include <stdio.h>

int main()
{

    int testes;

    printf("Quantos testes serao digitados? ");
    scanf("%d", &testes);

    int Quantidade_cobaias, coelhos = 0, ratos = 0, sapos = 0;
    char Tipo_cobaias;
    for (int i = 0; i < testes; i++) {
        printf("Quantidade de cobaias: ");
        scanf("%d", &Quantidade_cobaias);
        printf("Tipo de cobaia: ");
        scanf(" %c", &Tipo_cobaias);

        if (Tipo_cobaias == 'c' || Tipo_cobaias == 'C') {
            coelhos += Quantidade_cobaias;
        } else if (Tipo_cobaias == 'r' || Tipo_cobaias == 'R') {
            ratos += Quantidade_cobaias;
        } else if (Tipo_cobaias == 's' || Tipo_cobaias == 'S') {
            sapos += Quantidade_cobaias;
        }
    }

    printf("Relatorio final:\n");
    int total_cobaias = coelhos + ratos + sapos;
    printf("Total: %d\n", total_cobaias);
    printf("Total coelhos: %d\n", coelhos);
    printf("Total ratos: %d\n", ratos);
    printf("Total sapos: %d\n", sapos);

    double percentual_coelhos = (double)coelhos * 100 / total_cobaias;
    double percentual_ratos = (double)ratos * 100 / total_cobaias;
    double percentual_sapos = (double)sapos * 100 / total_cobaias;

    printf("Percentual de coelhos: %.2lf%%\n", percentual_coelhos);
    printf("Percentual de ratos: %.2lf%%\n", percentual_ratos);
    printf("Percentual de sapos: %.2lf%%", percentual_sapos);
    return 0;
}