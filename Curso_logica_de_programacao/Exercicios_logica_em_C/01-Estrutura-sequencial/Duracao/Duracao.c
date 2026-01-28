#include <stdio.h>

int main()
{

    int resto, horas, minutos, segundos, segundos_usuario;

    printf("Digite a duracao em segundos: ");
    scanf("%d", &segundos_usuario);

    horas = segundos * 60;

    horas = segundos_usuario / 3600;
    resto = segundos_usuario % 3600;

    minutos = resto / 60;
    segundos = resto % 60;

    printf("%d:%d:%d", horas, minutos, segundos);

    return 0;
}