import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<String, Integer> registroVotos = new HashMap();

        String caminhoArquivo = "/workspaces/Estudos/Java_completo_programacao_orientada_a_objetos/Exercicios/08_Generics_Set_Map/exercicio_contagem_votos/registros.csv";
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

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println(registroVotos);
    }
}
