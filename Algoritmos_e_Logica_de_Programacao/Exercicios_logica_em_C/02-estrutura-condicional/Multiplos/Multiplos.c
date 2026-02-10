#include <stdio.h>

int main()
{

    int numero1, numero2;

    printf("Digite dois numeros inteiros: \n");
    scanf("%d", &numero1);
    scanf("%d", &numero2);

    if (numero1 % numero2 == 0 || numero2 % numero1 == 0) {
        printf("Os numeros digitados sao multiplos");
    } else {
        printf("Os numeros digitados nao sao multiplos.");
    }

    return 0;
}