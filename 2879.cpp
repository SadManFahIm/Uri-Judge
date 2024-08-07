#include <iostream>

using namespace std;

int main(){
    int n, wins = 0, carro;

    cin >> n;

    for(int i = 0; i < n; i++){
        cin >> carro;
        
        if(carro != 1)
            wins++;
    }

    cout << wins << endl;
    return 0;
}
