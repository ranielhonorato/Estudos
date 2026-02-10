#include <stdio.h>

int main()
{

    double x, y;
    char stop = 's';

    while (stop != 'N' && stop != 'n') {

        printf("Valor de X: ");
        scanf(" %lf", &x);
        printf("Valor de Y: ");
        scanf(" %lf", &y);

        if (y == 0 && x == 0) {
            printf("Origem\n");
        } else if (y == 0) {
            printf("Eixo X\n");
        } else if (x == 0) {
            printf("Eixo Y\n");
        } else if (y > 0 && x > 0) {
            printf("Quadrante Q1\n");
        } else if (y > 0 && x < 0) {
            printf("Quadrante Q2\n");
        } else if (y < 0 && x < 0) {
            printf("Quadrante Q3\n");
        } else {
            printf("Quadrante Q4\n");
        }

        printf("Deseja continuar? Sim[S]/Nao[N]");
        scanf(" %c", &stop);
    }
    return 0;
}