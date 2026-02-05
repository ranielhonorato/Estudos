using System;
using System.Globalization;

namespace Progama
{
    class Progam
    {
        static void Main(string[] args)
        {

            CultureInfo CI = CultureInfo.InvariantCulture;

            double base_retangulo, altura, area;

            Console.Write("Base retangulo: ");
            base_retangulo = double.Parse(Console.ReadLine(), CI);
            Console.Write("Altura retangulo: ");
            altura = double.Parse(Console.ReadLine(), CI);

            area = base_retangulo * altura;
            double perimetro = 2 * (base_retangulo+altura);
            double diagonal =  Math.Sqrt(Math.Pow(base_retangulo, 2) + Math.Pow(altura, 2));

            Console.WriteLine("Area = " + area.ToString("F4", CI));
            Console.WriteLine("Perimetro = " + perimetro.ToString("F4", CI));
            Console.WriteLine("Diagonal = " + diagonal.ToString("F4", CI));

        }
    }
}