using System.Globalization;

namespace Soma_vetor;

class Program
{
    static void Main(string[] args)
    {

        CultureInfo CI = CultureInfo.InvariantCulture;

        int n;

        Console.Write("Qual a ordem da matriz? ");
        n = int.Parse(Console.ReadLine());

        double[,] vet = new double[n, n];

        int negativos = 0;

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                System.Console.Write("Elemento [" + i + "," + j + "]: ");
                vet[i, j] = double.Parse(Console.ReadLine(), CI);
                if (vet[i, j] < 0)
                {
                    negativos++;
                }
            }
        }


        System.Console.WriteLine("Diagonal principal: ");
        for (int i = 0; i < n; i++)
        {
            System.Console.Write(vet[i, i] + " ");
        }

        Console.WriteLine();

        System.Console.Write("Quantidade de negativos: " + negativos);


    }
}
