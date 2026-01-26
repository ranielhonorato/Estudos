#include <stdio.h>

int main(){

    int minutos;

    printf("Digite a quantidade de minutos: ");
    scanf("%d", &minutos);

    double plano_basico = 50.00;
    if (minutos > 100){
        plano_basico = plano_basico + (minutos - 100) * 2;
    }

    printf("Valor a pagar: %.2lf", plano_basico);
    

    return 0;
}