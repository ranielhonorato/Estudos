#include <stdio.h>

int main()
{

    int linhas, colunas;

    printf("Qual a quantidade de linhas da matriz? ");
    scanf("%d", &linhas);
    printf("Qual a quantidade de colunas da matriz? ");
    scanf("%d", &colunas);

    double matriz[linhas][colunas];
    for (int i = 0; i < linhas; i++) {
        printf("Digite os elementos da %da. linha: \n", i + 1);
        for (int j = 0; j < colunas; j++) {
            scanf("%lf", &matriz[i][j]);
        }
    }

    double vetor_somas[linhas];
    for (int i = 0; i < linhas; i++) {
        vetor_somas[i] = 0;
        for (int j = 0; j < colunas; j++) {
            vetor_somas[i] = vetor_somas[i] + matriz[i][j];
        }
    }

    printf("Vetor gerado: \n");
    for (int i = 0; i < linhas; i++) {
        printf("%2.lf\n", vetor_somas[i]);
    }

    return 0;
}