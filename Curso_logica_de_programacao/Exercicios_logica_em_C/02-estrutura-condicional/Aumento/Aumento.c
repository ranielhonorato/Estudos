#include <stdio.h>

int main(){

    double salario_inicial; 
    printf("Digite o salario da pessoa: ");
    scanf("%lf", &salario_inicial);

    double novo_salario;
    double porcentagem;
    if (salario_inicial <= 1000){
        novo_salario = salario_inicial * 0.2 + salario_inicial;
        porcentagem = 20;
    } else if (salario_inicial <= 3000){
        novo_salario = salario_inicial * 0.15 + salario_inicial;
        porcentagem = 15;
    } else if (salario_inicial <= 8000){
        novo_salario = salario_inicial * 0.1 + salario_inicial;
        porcentagem = 10;
    } else {
        novo_salario = salario_inicial * 0.05 + salario_inicial;
        porcentagem = 5;
    }

    printf("Novo salario = %.2lf\n", novo_salario);
    
    double aumento = salario_inicial - novo_salario;
    printf("aumento = %.2lf\n", aumento);
    printf("Porcentagem = %.2lf%%", porcentagem);

    return 0;
}