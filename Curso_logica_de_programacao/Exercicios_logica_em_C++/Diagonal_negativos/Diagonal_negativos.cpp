#include <iomanip>
#include <iostream>

using namespace std;

int main()
{

    int n;

    cout << "Qual a ordem da matriz? ";
    cin >> n;

    int elemento[n][n];
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            cout << "Elemento [" << i << "," << j << "]: ";
            cin >> elemento[i][j];
        }
    }

    cout << "Diagonal principal: \n";
    for (int i = 0; i < n; i++) {
            cout << elemento[i][i] << " ";
    }

    int NumerosNegativos = 0;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (elemento[i][j] < 0){
                NumerosNegativos++;
            }
        }
    }

    cout << "\nQuantidade de negativos = " << NumerosNegativos;
    
    return 0;
}