import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> registroVotos = new LinkedHashMap<>();

        System.out.print("Digite o caminho do arquivo CSV: ");
        String caminhoArquivo = sc.nextLine();
        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {

            String registroLido = br.readLine();
            while (registroLido != null) {
                String[] nomeVoto = registroLido.split(",");
                String nome = nomeVoto[0].trim();
                int votosAtuais = Integer.parseInt(nomeVoto[1].trim());

                if (registroVotos.containsKey(nome)) {
                    int votosAnteriores = registroVotos.get(nome);
                    registroVotos.put(nome, votosAnteriores + votosAtuais);
                } else {
                    registroVotos.put(nome, votosAtuais);
                }

                registroLido = br.readLine();
            }

            for (String chave : registroVotos.keySet()) {
                System.out.println("Candidato: " + chave + " votos: " + registroVotos.get(chave));
            }

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println(registroVotos);
    }
}
