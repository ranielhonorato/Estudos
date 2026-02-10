#include <stdio.h>

int main()
{

    int medida_glicose;
    printf("Digitre a medida da clisoe: ");
    scanf("%d", &medida_glicose);

    if (medida_glicose <= 100) {
        printf("Classificacao: normal");
    } else if (medida_glicose <= 140) {
        printf("Classificacao: elevado");
    } else {
        printf("Classificacao: diabetes");
    }

    return 0;
}