#include <stdio.h>

int main()
{

    int senha;

    // Usuario define a senha
    printf("Defina a senha: ");
    scanf("%d", &senha);

    // Loop para validar se a senha digitada é a mesma definida pelo usuario
    int valida_senha;
    printf("Digite sua senha para ter acesso: ");
    do {
        scanf("%d", &valida_senha);

        if (valida_senha != senha) {
            printf("Senha invalida! Tente novamente: ");
        }

    } while (valida_senha != senha);

    printf("\nAcesso permitido");

    return 0;
}