// programa para ler e transformar temperatura em celsius ou farenheint de acordo com a escolha do usuário

#include <stdio.h>

int main()
{
    char escala;
    printf("Voce vai digitar a temperatura em qual escala (C/F)");
    scanf(" %c", &escala);

    double graus;
    if (escala == 'f' || escala == 'F' ) {
        printf("Digite a temperatura em farenheint: ");
        scanf("%lf", &graus);
        double celsius = (graus - 32) / 1.8;
        printf("Temperatura equivalente em celius: %.2lf", celsius);
    } else if (escala == 'c' || escala == 'C') {
        printf("Digite a temperatura em celsius: ");
        scanf("%lf", &graus);
        double farenheint = graus * 1.8 + 32;
        printf("Temperatura equivalente em farenheint: %.2lf", farenheint);
    } else {
        printf("Temperatura escolhida invalida.");
    }

    return 0;
}