#include <iomanip>
#include <iostream>
#include <string>

using namespace std;

int main()
{

    int n;

    cout << "Quantas pessoas serao digitadas? ";
    cin >> n;

    string nome[n];
    int idade[n];
    double altura[n];

    for (int i = 0; i < n; i++) {
        cout << "Dados da " << i + 1 << "a pessoa: \n";
        cout << "Nome: ";
        cin.ignore(INT_MAX, '\n');
        getline(cin, nome[i]);
        cout << "Idade: ";
        cin >> idade[i];
        cout << "Altura: ";
        cin >> altura[i];
    }

    double soma_altura = 0;
    for (int i = 0; i < n; i++) {
        soma_altura += altura[i];
    }

    cout << fixed << setprecision(2);
    double media_altura = soma_altura / n;
    cout << "Altura media: " << media_altura;

    int menor16 = idade[0], ContagemMenor = 0;
    string NomeMenor[n];
    for (int i = 0; i < n; i++) {
        if (menor16 > idade[i]) {
            menor16 = idade[i];
            ContagemMenor++;
            NomeMenor[i] = nome[i];
        }
    }

    cout << fixed << setprecision(2);
    double PorcentagemMenor = (double)ContagemMenor * 100 / n;
    cout << "\nPessoas com menos de 16 anos: " << PorcentagemMenor << "%\n";

    for (int i = 0; i < n; i++) {
        if (idade[i] < 16) {
            cout << nome[i] << "\n";
        }
    }

    return 0;
}