#include <stdio.h>

int main()
{

    double km, combustivel;

    printf("Distancia percorrida: ");
    scanf("%lf", &km);
    printf("Combustivel gasto: ");
    scanf("%lf", &combustivel);

    double consumo = km / combustivel;
    printf("Consumo medio = %.3lf", consumo);

    return 0;
}