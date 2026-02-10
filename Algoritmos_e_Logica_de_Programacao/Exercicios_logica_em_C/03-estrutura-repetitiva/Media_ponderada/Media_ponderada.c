#include <stdio.h>

int main()
{

    

    // Explica os pesos das notas
    printf("Calcule sua média OBS: primeira nota peso 2, segunda nota peso 3, Terceira nota peso 5\n");

    // Recebe as notas do usuario 
    printf("Digite suas tres notas para calcular a media:\n");
    double numeros[3];
    for (int i = 0; i < 3; i++) {
        scanf("%lf", &numeros[i]);
    }

    // Ajusta os valores das notas com base no peso
    double soma = (numeros[0] * 2)  + (numeros[1] * 3) + (numeros[2] * 5);

    // Calcula a media e exibe ao usuario
    double media = soma / 10;
    printf("Media = %.1lf", media);

    return 0;
}