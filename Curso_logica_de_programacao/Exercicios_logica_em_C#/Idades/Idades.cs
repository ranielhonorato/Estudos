using System.Globalization;

namespace Idades;

class Program
{
    static void Main(string[] args)
    {

        CultureInfo CI = CultureInfo.InvariantCulture;

        string nome1, nome2;
        int idade1, idade2;

        Console.WriteLine("Dados da primeira pessoa:");
        Console.Write("Nome: ");
        nome1 = Console.ReadLine();

        Console.Write("Idade: ");
        idade1 = int.Parse(Console.ReadLine());

        Console.WriteLine("Dados da segunda pessoa: ");
        Console.Write("Nome: ");
        nome2 = Console.ReadLine();

        Console.Write("Idade: ");
        idade2 = int.Parse(Console.ReadLine());

        double media_idade = (double)(idade1 + idade2) / 2.0;

        System.Console.WriteLine("A idade media de " + nome1 + " e " + nome2 + " e de " + media_idade.ToString("F1", CI) + " anos");
    }
}
