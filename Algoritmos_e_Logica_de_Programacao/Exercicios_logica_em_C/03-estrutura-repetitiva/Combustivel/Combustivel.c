#include <stdio.h>

int main()
{
    // informa a numeração de cada combustivel
    printf("1 - Alcool\n");
    printf("2 - Gasolina\n");
    printf("3 - Diesel\n\n");

    // Loop recebe a informação e soma quantas vezes o combustivel foi comprado
    int Alcool = 0, Gasolina = 0, Diesel = 0, escolha = 0;
    while (escolha != 4) {
        printf("Informe um codigo (1, 2, 3) ou 4 para parar: ");
        scanf("%d", &escolha);

        if (escolha == 1) {
            Alcool += 1;
        } else if (escolha == 2) {
            Gasolina += 1;
        } else if (escolha == 3) {
            Diesel += 1;
        }
    }

    // Mostra ao usuário o total de fornecimento de cada combustível
    printf("Muito obrigado!\n");
    printf("Alcool: %d\n", Alcool);
    printf("Gasolina: %d\n", Gasolina);
    printf("Diesel: %d\n", Diesel);

    return 0;
}