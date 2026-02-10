#include <stdio.h>

int main()
{

    double x = 1, y = 1;

    while (x != 0 && y != 0) {

        printf("Valor de X: ");
        scanf(" %lf", &x);
        printf("Valor de Y: ");
        scanf(" %lf", &y);

        if (y > 0 && x > 0) {
            printf("Quadrante Q1\n\n");
        } else if (y > 0 && x < 0) {
            printf("Quadrante Q2\n\n");
        } else if (y < 0 && x < 0) {
            printf("Quadrante Q3\n\n");
        } else if (y < 0 && x > 0) {
            printf("Quadrante Q4\n\n");
        }

    }

    return 0;
}