using System.Globalization;

namespace Soma_vetor;

class Program
{
    static void Main(string[] args)
    {

        CultureInfo CI = CultureInfo.InvariantCulture;

        int n;

        Console.Write("Quantos numeros voce vai digitar? ");
        n = int.Parse(Console.ReadLine());

        double[] vet = new double[n];

        for (int i = 0; i < n; i++)
        {
            System.Console.Write("Digite um numero: ");
            vet[i] = double.Parse(Console.ReadLine(), CI);
        }

        double soma = 0, media = 0;
        System.Console.Write("Valores = "); 
        for (int i = 0; i < n; i++)
        {
            System.Console.Write(" " + vet[i].ToString("F2", CI));
            soma += vet[i];
        }

        System.Console.WriteLine();

        media = soma / n;
        System.Console.WriteLine("Soma = " + soma.ToString("F2", CI));
        System.Console.WriteLine("Media = " + media.ToString("F2", CI));
        

    }
}
