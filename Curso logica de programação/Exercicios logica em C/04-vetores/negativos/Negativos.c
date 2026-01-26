#include <stdio.h>

int main()
{

    int n;

    printf("Quantos numeros voce vai digitar? ");
    scanf("%d", &n);

    int x[n];

    for (int i = 0; i < n; i++)
    {
        printf("Digite um numero: ");
        scanf("%d", &x[i]);
    }

    printf("Numeros negativos:\n");
    for (int i = 0; i < n; i++)
    {
        if (x[i] < 0)
        {
            printf("%d\n", x[i]);
        }
    }

    return 0;
}