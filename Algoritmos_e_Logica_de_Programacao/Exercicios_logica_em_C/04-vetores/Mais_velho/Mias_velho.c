#include <stdio.h>

int main()
{

    int tamanho_vetor;

    printf("Quantas pessoas voce vai digitar? ");
    scanf("%d", &tamanho_vetor);

    char nomes_pessoas[tamanho_vetor][50];
    int idade_pessoas[tamanho_vetor];
    for (int i = 0; i < tamanho_vetor; i++) {
        printf("Dados da %da pessoa: ", i + 1);
        printf("\nNome: ");
        while (getchar() != '\n');
        fgets(nomes_pessoas[i], 50, stdin);
        printf("Idade: ");
        scanf("%d", &idade_pessoas[i]);
    }

    int idade_maior = 0;
    char mais_velho;
    for (int i = 0; i < tamanho_vetor; i++) {
        if (idade_maior < idade_pessoas[i]) {
            idade_maior = idade_pessoas[i];
            mais_velho = i;
        }
    }

    printf("Pessoa mais velha: %s", nomes_pessoas[mais_velho]);

    return 0;
}