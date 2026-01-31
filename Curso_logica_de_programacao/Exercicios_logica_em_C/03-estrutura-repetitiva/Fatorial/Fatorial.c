#include <stdio.h>

int main()
{

    int numero_natural;
    printf("Digite um numero natural: ");
    scanf("%d", &numero_natural);

    int resultado = 1;
    for (int i = 1; i <= numero_natural; i++) {
        resultado *= i;
    }

    printf("Fatorial = %d", resultado);

    return 0;
}