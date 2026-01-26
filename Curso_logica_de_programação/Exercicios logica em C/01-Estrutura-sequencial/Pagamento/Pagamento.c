#include <stdio.h>

int main(){

    char Nome[30];
    double valor_hora, pagamento;
    int horas_trabalhadas;

    printf("Nome: ");
    fgets(Nome, 50, stdin);
    printf("Valor por hora: ");
    scanf("%lf", &valor_hora);
    printf("Horas trabalhadas: ");
    scanf("%d", &horas_trabalhadas);

    pagamento = valor_hora * horas_trabalhadas;
    printf("O pagamento para %s deve ser %.2lf", Nome, pagamento);

    return 0;
}