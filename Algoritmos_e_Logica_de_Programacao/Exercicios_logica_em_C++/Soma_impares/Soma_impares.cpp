#include <iostream>

using namespace std;

int main()
{

    int x, y;

    cout << "Digite dois numeros: \n";
    cin >> x >> y;

    // troca para x sempre ser o maior
    int troca;
    if (x < y) {
        troca = x;
        x = y;
        y = troca;
    }

    int soma = 0;
    for (int i = y+1; i < x; i++) {
        if (i % 2 != 0) {
            soma += i;
        }
    }

    cout << "Soma dos impares = " << soma;

    return 0;
}