#include <stdio.h>

int main()
{
    int x = 1;

    int soma = 0;
    while (x != 0) {
        printf("Digite um numero inteiro: ");
        scanf("%d", &x);

        soma = 0;

        if (x == 0)
            break;

        if (x % 2 != 0) {
            x += 1;
        }

        soma += x * 5 + 20;

        printf("Soma = %d\n\n", soma);
    }

    return 0;
}