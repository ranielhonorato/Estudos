#include <stdio.h>

int main()
{

    int produto;
    printf("Codigo do produto comprado: ");
    scanf("%d", &produto);
    int quantidade;
    printf("Quantidade comprada: ");
    scanf("%d", &quantidade);

    double valor_produto;
    if (produto == 1) {
        valor_produto = (double)quantidade * 5.00;
    } else if (produto == 2) {
        valor_produto = (double)quantidade * 3.50;
    } else if (produto == 3) {
        valor_produto = (double)quantidade * 4.80;
    } else if (produto == 4) {
        valor_produto = (double)quantidade * 8.90;
    } else if (produto == 5) {
        valor_produto = (double)quantidade * 7.32;
    }

    printf("Valor a pagar: %.2lf", valor_produto);

    return 0;
}