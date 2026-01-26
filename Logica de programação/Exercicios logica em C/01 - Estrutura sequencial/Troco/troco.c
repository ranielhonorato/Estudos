#include <stdio.h>

int main(){

    double Preco_Unitario, quantidade, recebido, troco;

    printf("Preco unitario do produto: ");
    scanf("%lf", &Preco_Unitario);
    printf("Quantidade comprada:" );
    scanf("%lf", &quantidade);
    printf("Dinheiro recebido: ");
    scanf("%lf", &recebido);

    troco = recebido - (Preco_Unitario * quantidade);
    printf("Troco = %2.lf", troco);

    return 0;
}