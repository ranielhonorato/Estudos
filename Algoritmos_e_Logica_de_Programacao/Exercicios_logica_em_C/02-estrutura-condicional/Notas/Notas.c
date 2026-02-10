#include <stdio.h>

int main()
{

    double nota1, nota2, Nota_Final;

    // Solicita as notas ao usuario
    printf("Digite a primeira nota: ");
    scanf("%lf", &nota1);
    printf("Digite a segunda nota: ");
    scanf("%lf", &nota2);

    // Calcula a nota final
    Nota_Final = (nota1 + nota2);

    // mostra a nota final na tela
    printf("\n Nota final: %.2lf", Nota_Final);

    // Verifica se foi aprovado ou reprovado
    if (Nota_Final < 60) {
        printf("\nreprovado");
    } else {
        printf("\nAprovado");
    }

    return 0;
}