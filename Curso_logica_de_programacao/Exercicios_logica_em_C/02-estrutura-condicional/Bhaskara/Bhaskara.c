#include <stdio.h>
#include <math.h>

int main(){

// Declaração das variáveis
double a, b, c, delta, x1, x2;


// Entrada dos coeficientes
printf("Coeficiente a: "); 
scanf("%lf", &a);
printf("Coeficiente b: "); 
scanf("%lf", &b);
printf("Coeficiente c: "); 
scanf("%lf", &c);


// Verifica se 'a' é igual a zero
if (a == 0) {
    printf("Coeficiente 'a' nao pode ser igual a zero.\n");
    return 0;
}


// Faz o calculo do delta
delta = pow(b, 2) - 4 * a * c;


// Verifica se delta é negativo
if (delta < 0) {
    printf("Delta negativo. Nao existem raizes reais.\n");
} else {
    // Calcula o valor de x1 e x2
    x1 = (-b + sqrt(delta)) / (2 * a);
    x2 = (-b - sqrt(delta)) / (2 * a);
    
    // Apresenta os valores de x1 e x2
    printf("x1 = %.2lf\n", x1);
    printf("x2 = %.2lf\n", x2);
}


    return 0;
}