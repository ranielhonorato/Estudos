#include <stdio.h>

int main()
{

    int alunos;

    printf("Quantos alunos serao digitados? ");
    scanf("%d", &alunos);

    char nome_alunos[alunos][50];
    double nota1[alunos], nota2[alunos];
    for (int i = 0; i < alunos; i++) {
        printf("Digite o nome, primeira e segunda nota do 1o aluno: \n");
        while (getchar() != '\n');
        fgets(nome_alunos[i], 50, stdin);
        scanf("%lf", &nota1[i]);
        scanf("%lf", &nota2[i]);
    }

    printf("Alunos aprovados: \n");

    double media_alunos = 0;
    for (int i = 0; i < alunos; i++) {
        media_alunos = (nota1[i] + nota2[i]) / 2;
        if (media_alunos >= 6) {
            printf("%s", nome_alunos[i]);
        }
    }

    return 0;
}