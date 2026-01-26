#include <stdio.h>

int main(){

    int i, n, x[i], menor_numero;

    // Entrada de dados do usuario
    printf("Quantos numeros serao digitados: ");
    scanf("%d", &n);
    
    // Loop para ler os numeros
    for (i = 0; i < n; i++){
        printf("Digite o %d numero: ", i + 1);
        scanf("%d", &x[i]);
    }

    // inicializa o menor numero com o primeiro valor do array
    menor_numero = x[0];

    // Verifica o menor numero entre os digitados e guarda na variavel menor_numero
    for (int i = 0; i < n; i++){
        if (menor_numero > x[i]){
            menor_numero = x[i];
        }
    }
    
    // Exibe o menor numero guardado na variavel menor_numero
    printf("Menor numero: %d\n", menor_numero);



    return 0;
}