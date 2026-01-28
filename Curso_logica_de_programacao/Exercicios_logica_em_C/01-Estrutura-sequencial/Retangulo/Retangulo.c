#include <math.h>
#include <stdio.h>

int main()
{

    // Declara as variáveis
    double largura, altura, area, perimetro, diagonal;

    // Pede ao usuario para inserir a largura e altura do retangulo
    printf("Base do retangulo: ");
    scanf("%lf", &largura);

    printf("Altura do rentangulo: ");
    scanf("%lf", &altura);

    // Calcula a area, perimetro e diagonal
    area = largura * altura;
    perimetro = 2 * (largura + altura);
    diagonal = sqrt(pow(largura, 2) + pow(altura, 2));

    // Mostra o resultado da area, perimetro e diagonal
    printf("Area = %.4lf\n", area);
    printf("Perimetro = %.4lf\n", perimetro);
    printf("Diagonal = %.4lf\n", diagonal);

    return 0;
}