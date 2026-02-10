#include <stdio.h>

int main(){
    
// Declaração das variáveis
double AreaTerreno, largura, comprimento;
double ValorTerreno, ValorMetroQuadrado;

// Recebe os valores de largura e comprimento do terreno
printf("Digite a largura do terreno: ");
scanf("%lf", &largura);

printf("Digite o comprimento do terreno: ");
scanf("%lf", &comprimento);

printf("Digite o valor do metro quadrado: ");
scanf("%lf", &ValorMetroQuadrado);

// Faz o calculo do terreno
AreaTerreno = largura * comprimento;
ValorTerreno = ValorMetroQuadrado * AreaTerreno;

// Exibe a area do terreno e custo total
printf("\nArea do terreno = %.2lf\n", AreaTerreno);
printf("Preco do terreno = %.2lf\n", ValorTerreno);

return 0;
}