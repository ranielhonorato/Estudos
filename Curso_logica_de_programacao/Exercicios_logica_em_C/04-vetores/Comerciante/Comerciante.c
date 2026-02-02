#include <stdio.h>

int main()
{

    int total_produtos;
    printf("Serao digitados dados de quantos produtos? ");
    scanf("%d", &total_produtos);

    char nome_produto[total_produtos][40];
    double preco_compra[total_produtos], preco_venda[total_produtos];
    for (int i = 0; i < total_produtos; i++) {
        printf("Produto: %d\n", i + 1);
        printf("Nome: ");
        while (getchar() != '\n');
        fgets(nome_produto[i], 40, stdin);
        printf("Preco de compra: ");
        scanf("%lf", &preco_compra[i]);
        printf("Preco de venda: ");
        scanf("%lf", &preco_venda[i]);
    }

    int abaixo10 = 0, entre10e20 = 0, acima20 = 0;
    for (int i = 0; i < total_produtos; i++) {
        if ((preco_venda[i] - preco_compra[i]) * 100 / preco_compra[i] < 10) {
            abaixo10++;
        } else if ((preco_venda[i] - preco_compra[i]) * 100 / preco_compra[i] >= 10 && (preco_venda[i] - preco_compra[i]) * 100 / preco_compra[i] <= 20) {
            entre10e20++;
        } else if ((preco_venda[i] - preco_compra[i]) * 100 / preco_compra[i] > 20) {
            acima20++;
        }
    }

    printf("\nRelatorio: ");
    printf("\nLucro abaixo de 10%% %d", abaixo10);
    printf("\nLucro entre 10%% e 20%% %d", entre10e20);
    printf("\nLucro acima de 20%% %d", acima20);

    double total_compra = 0, total_venda = 0;
    for (int i = 0; i < total_produtos; i++) {
        total_compra += preco_compra[i];
        total_venda += preco_venda[i];
    }

    printf("\nValor total de compra: %.2lf", total_compra);
    printf("\nValor total de venda: %.2lf", total_venda);

    double lucro_total = total_venda - total_compra  ;
    printf("\nLucro total: %.2lf", lucro_total);

    return 0;
}