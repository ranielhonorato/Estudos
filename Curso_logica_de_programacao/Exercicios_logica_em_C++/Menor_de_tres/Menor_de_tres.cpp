#include <iomanip>
#include <iostream>

using namespace std;

int main()
{

    int quantidade;

    cout << "Quantos valores serao digitados? ";
    cin >> quantidade;

    int numeros[quantidade], menor = INT_MAX;
        
    for (int i = 0; i < quantidade; i++) {
        cout << "Digite o " << i+1 << "o numero: ";
        cin >> numeros[i];
        if (menor > numeros[i]) {
            menor = numeros[i];
        }
    }

    cout << "Menor = " << menor;

    return 0;
}