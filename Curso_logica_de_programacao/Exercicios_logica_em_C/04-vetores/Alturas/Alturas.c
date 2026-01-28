#include <stdio.h>
#include <string.h>

void limpar_entrada()
{
    char c;
    while ((c = getchar()) != '\n' && c != EOF)
        ;
}

int main()
{

    int Quantidade_Pessoas;

    printf("Quantas pessoas serao digitadas: ");
    scanf("%d", &Quantidade_Pessoas);
    limpar_entrada();

    char Nome_Pessoa[Quantidade_Pessoas][50];
    int Idade_Pessoa[Quantidade_Pessoas];
    double Altura_Pessoa[Quantidade_Pessoas];

    for (int i = 0; i < Quantidade_Pessoas; i++) {
        printf("\nDados da %da pessoa:\n", i + 1);
        printf("Nome: ");
        fgets(Nome_Pessoa[i], 50, stdin);
        printf("Idade: ");
        scanf("%d", &Idade_Pessoa[i]);
        printf("Altura: ");
        scanf("%lf", &Altura_Pessoa[i]);
        limpar_entrada();
    }

    double Soma_Alturas = 0;
    for (int i = 0; i < Quantidade_Pessoas; i++) {
        Soma_Alturas = Soma_Alturas + Altura_Pessoa[i];
    }

    double Media_Altura = Soma_Alturas / Quantidade_Pessoas;
    printf("\nAltura media: %.2lf", Media_Altura);

    int Menor16 = 0;
    for (int i = 0; i < Quantidade_Pessoas; i++) {
        if (Idade_Pessoa[i] < 16) {
            Menor16 = Menor16 + 1;
        }
    }
    double Porcentagem_Menor16 = Menor16 * 100 / Quantidade_Pessoas;

    printf("\nPessoas com menos de 16 anos: %.2lf%%\n", Porcentagem_Menor16);

    for (int i = 0; i < Quantidade_Pessoas; i++) {
        if (Idade_Pessoa[i] < 16) {
            printf("%s", Nome_Pessoa[i]);
        }
    }

    return 0;
}