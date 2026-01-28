#include <math.h>
#include <stdio.h>

int main()
{

    double medida_A, medida_B, medida_C;
    printf("Digite a medida A: ");
    scanf("%lf", &medida_A);
    printf("Digite a medida B: ");
    scanf("%lf", &medida_B);
    printf("Digite a medida C: ");
    scanf("%lf", &medida_C);

    double area_quadrado = pow(medida_A, 2);
    double area_triangulo = medida_A * medida_B / 2;
    double area_trapezia = (medida_A + medida_B) * medida_C / 2;

    printf("Area do quadrado = %.4lf\n", area_quadrado);
    printf("Area do quadrado = %.4lf\fn", area_triangulo);
    printf("Area do quadrado = %.4lf\n", area_trapezia);

    return 0;
}