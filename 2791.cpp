#include <iostream>

using namespace std;

int main(){
    bool copos[4];
    int  i;

    for(i = 0; i < 4; i++)
        cin >> copos[i];
    for(i = 0; i < 4; i++)
        if(copos[i])
            break;

    cout << i + 1 << endl;
    


    return 0;
}
