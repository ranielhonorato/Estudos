#include <stdio.h>
#include <string.h>

void limpar_buffer() {
    int c;
    while ((c = getchar()) != '\n' && c != EOF);
}

int main() {
    int idade1, idade2;
    double media_idades;
    char nome1[50], nome2[50];

    // Recebe os dados da primeira pessoa
    printf("Digite o nome da primeira pessoa: \n");
    printf("Nome: ");
    fgets(nome1, 50, stdin);
    printf("Digite a idade da primeira pesssoa: \n");
    printf("Idade: ");
    scanf("%d", &idade1);
    limpar_buffer(); // Limpa o buffer do teclado após ler a idade

    // Recebe os dados da segunda pessoa
    printf("\nDigite o nome da segunda pessoa: \n");
    printf("Nome: ");
    fgets(nome2, 50, stdin);
    printf("Digite a idade da segunda pessoa: \n");
    printf("Idade: ");
    scanf("%d", &idade2);

    // Exibe na tela os dados da primeira pessoa digitados pelo usuário
    printf("\nDados da primeira pessoa: ");
    printf("\nNome: %s", nome1);
    printf("Idade: %d\n", idade1);

    // Exibe na tela os dados da segunda pessoa digitados pelo usuário
    printf("\nDados da segunda pessoa: ");
    printf("\nNome: %s", nome2);
    printf("Idade: %d", idade2);

    media_idades = (double) (idade1 + idade2) / 2;

    printf("\n\n A idade media de Maria Silva e Joao Melo e: %.2lf", media_idades);

    return 0;
}