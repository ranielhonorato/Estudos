#include <stdio.h>

int main()
{

    int casos;
    printf("Quantos casos voce vai digitar? ");
    scanf("%d", &casos);

    // Loop faz a divisao e exibe o resultado, caso denominador 0 informa a impossibilidade de execução
    double numerador[casos], denominador[casos], divisao;
    for (int i = 0; i < casos; i++) {
        printf("Digite o numerador: ");
        scanf("%lf", &numerador[i]);
        printf("Digite o denominador: ");
        scanf("%lf", &denominador[i]);

        if (denominador[i] == 0) {
            printf("Divisao impossivel!\n\n");
        } else {
            divisao = numerador[i] / denominador[i];
            printf("Divisao = %.2lf\n\n", divisao);
        }
    }

    return 0;
}