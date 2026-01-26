#include <stdio.h>

int main()
{
    // --- Declara as variáveis ---
    double preco_unitario, dinheiro_recebido;
    int quantidade;

    // ---- Recebe as informações do usuário ---
    printf("Preco unitario do produto: ");
    scanf("%lf", &preco_unitario);
    printf("Quantidade do produto: ");
    scanf("%d", &quantidade);
    printf("Dinheiro recebido: ");
    scanf("%lf", &dinheiro_recebido);

    // --- Declara e calcula a variável valor do produto ---
    double valor_produto = preco_unitario * quantidade;

    // --- Confere o valor recebido e informar se tem troco ---
    if (valor_produto > dinheiro_recebido) {
        double falta_completar = valor_produto - dinheiro_recebido;
        printf("Dinheiro insuficiente. Faltam R$ %.2lf, para completar\n", falta_completar);
    } else if (valor_produto < dinheiro_recebido) {
        double troco = dinheiro_recebido - valor_produto;
        printf("Troco = %.2lf\n", troco);
    } else {
        printf("Compra finalizada");
    }

    return 0;
}