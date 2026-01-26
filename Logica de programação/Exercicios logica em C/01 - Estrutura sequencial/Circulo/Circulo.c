#include <stdio.h>
#include <math.h>

int main(){

    double raio, area;


    printf("Digite o valor do raio do circulo: ");
    scanf("%lf", &raio);


    area = M_PI * pow(raio, 2);
    printf("Area = %.3lf", area);


    return 0;
}