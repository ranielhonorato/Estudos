#include <stdio.h>

int main()
{

    int Quantidade_Valores;

    printf("Quantos numeros voce vai digitar? ");
    scanf("%d", &Quantidade_Valores);

    int valores[Quantidade_Valores];
    int Dentro = 0, Fora = 0;

    for (int i = 0; i < Quantidade_Valores; i++) {
        printf("Digite um numero: ");
        scanf("%d", &valores[i]);

        if (valores[i] >= 10 && valores[i] <= 20) {
            Dentro++;
        } else {
            Fora++;
        }
    }

    printf("%d Dentro\n", Dentro);
    printf("%d Fora", Fora);

    return 0;
}