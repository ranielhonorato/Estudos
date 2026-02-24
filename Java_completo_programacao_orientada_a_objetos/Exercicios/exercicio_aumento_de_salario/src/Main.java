import entities.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String args[]) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Funcionario> list = new ArrayList<>();

        System.out.print("Quandos funcionarios serao cadastrados? ");
        int totalParaCadastro = sc.nextInt();


        for (int i = 0; i < totalParaCadastro; i++) {

            System.out.println();
            System.out.println("Funcionario #" + (i + 1) + ":");
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            while (hasId(list, id)) {
                System.out.print("o id ja existe. Tente novamente: ");
                id = sc.nextInt();
            }
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Salario: ");
            Double salario = sc.nextDouble();

            list.add(new Funcionario(id, nome, salario));

        }

        System.out.println();
        System.out.print("Digite o id do funcionario que tera aumento salarial: ");
        int id = sc.nextInt();
        Funcionario funcionario = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (funcionario == null) {
            System.out.println("O id não existe na base de dados!");
        } else {
            System.out.print("Qual a porcentagem de aumento? ");
            double porcentagem = sc.nextDouble();
            funcionario.aumentoSalarial(porcentagem);
        }

        System.out.println();
        System.out.println("Lista de funcionarios: ");
        for ( Funcionario obj : list) {
            System.out.println(obj);
        }


        sc.close();
    }

    public static boolean hasId(List<Funcionario> list, Integer id) {
        Funcionario funcionario = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return funcionario != null;
    }
}