///  Exercicio de matriz
///  Foi treinado a utilização de matriz e compreendimento de como navegar pelo seu tamanho para obtenção de dados.

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas linhas tera a matriz? ");
        int n = sc.nextInt();
        System.out.print("Quantas colunas tera a matriz? ");
        int m = sc.nextInt();

        int[][] matriz = new int[n][m];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Digite o elemento [" + i + "," + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        System.out.print("Posicao do elemento: ");
        int posicaoElemento = sc.nextInt();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == posicaoElemento) {
                    System.out.println("Posicao elemento: " + i + "," + j);
                    if (j > 0) {
                        System.out.println("Esquerda: " + matriz[i][j - 1]);
                    }
                    if (i > 0) {
                        System.out.println("Cima: " + matriz[i - 1][j]);
                    }
                    if (j < matriz[i].length - 1) {
                        System.out.println("direita: " + matriz[i][j + 1]);
                    }
                    if (i < matriz.length - 1) {
                        System.out.println("Baixo: " + matriz[i + 1][j]);
                    }
                }
            }
            System.out.println();
        }


    }
}