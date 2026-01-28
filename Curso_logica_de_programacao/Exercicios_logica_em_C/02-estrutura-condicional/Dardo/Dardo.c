#include <stdio.h>

int main()
{
    // Variavel que recebe quantidade de lançamentos
    int Lancamentos;
    // Pergunta e recebe do usuário quantia de lançamentos
    printf("Digite a quantidade de lancamentos realizados: ");
    scanf("%d", &Lancamentos);

    // Define vetor variável para guardar distancias dos lançamentos
    double distancias[Lancamentos];
    for (int i = 0; i < Lancamentos; i++) {
        printf("Digite a %da distancia\n", i + 1);
        scanf("%lf", &distancias[i]);
    }

    // Lógica para guardar o maior lançamento
    double Maior_Distancia = distancias[0];
    for (int i = 0; i < Lancamentos; i++) {
        if (distancias[i] > Maior_Distancia) {
            Maior_Distancia = distancias[i];
        }
    }

    // Mostra na tela a maior distancia dos lancamentos
    printf("Maior distancia = %.2lf", Maior_Distancia);

    return 0;
}