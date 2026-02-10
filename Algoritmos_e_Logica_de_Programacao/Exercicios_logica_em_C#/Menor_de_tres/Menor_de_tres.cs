using System.Globalization;

namespace Menor_de_tres;

class Program
{
    static void Main(string[] args)
    {

        CultureInfo CI = CultureInfo.InvariantCulture;

        int valor1, valor2, valor3, menor;

        Console.Write("Primeiro valor: ");
        valor1 = int.Parse(Console.ReadLine());
        Console.Write("Segundo valor: ");
        valor2 = int.Parse(Console.ReadLine());
        Console.Write("Terceiro valor: ");
        valor3 = int.Parse(Console.ReadLine());

        if (valor1 <= valor2 && valor1 <= valor3)
        {
            menor = valor1;
        }else if (valor2 <= valor3)
        {
            menor = valor2;
        }
        else
        {
            menor = valor3;
        }

        System.Console.Write("Menor = " + menor);

    }
}
