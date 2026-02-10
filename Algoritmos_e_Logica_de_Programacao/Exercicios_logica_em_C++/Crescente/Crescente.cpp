#include <iostream>

using namespace std;

int main()
{

    int x, y;
    cout << "Digite dois numeros: \n";
    cin >> x;
    cin >> y;

    while (x != y) {
        if (x > y) {
            cout << "Crescente!\n";
        } else if (x < y) {
            cout << "Decrescente!\n";
        }
        cout << "Digite outros dois numeros: \n";
        cin >> x;
        cin >> y;
    }
}