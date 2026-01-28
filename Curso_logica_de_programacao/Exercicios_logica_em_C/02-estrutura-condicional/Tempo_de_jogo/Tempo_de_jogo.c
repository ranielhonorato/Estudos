#include <stdio.h>

int main()
{

    int hora_inicial, hora_final;
    printf("Digite a hora inicial do jogo: ");
    scanf("%d", &hora_inicial);
    printf("Digite a hora final do jogo: ");
    scanf("%d", &hora_final);

    int inicial_minutos = hora_inicial * 60;
    int final_minutos = hora_final * 60;
    int duracao;

    if (final_minutos > inicial_minutos) {
        duracao = (final_minutos - inicial_minutos) / 60;
    } else {
        duracao = (1440 - inicial_minutos + final_minutos) / 60;
    }

    printf("O jogo durou %d hora(s)", duracao);

    return 0;
}