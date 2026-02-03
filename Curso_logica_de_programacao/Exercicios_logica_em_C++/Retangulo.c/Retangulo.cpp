#include <iostream>
#include <iomanip>
#include <string>
#include <math.h>

using namespace std;

int main(){

        double base, altura, comprimento, perimetro, diagonal, area;

        cout << "Base do retangulo: ";
        cin >> base;
        cout << "Altura do retangulo: ";
        cin >> altura;

        area = base * altura;
        perimetro = (2 * base) + (2 * altura);
        diagonal = sqrt(pow(base,2) + pow(altura,2));

        cout << fixed << setprecision(4);
        cout << "\nArea = " << area;
        cout << "\nPerimetro = "<< perimetro;
        cout << "\nDiagonal = " << diagonal;

    return 0;
}
