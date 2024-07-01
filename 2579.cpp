#include <bits/stdc++.h>
 
using namespace std;
typedef unsigned long long ull;//ULL
typedef long long ll;//1LL
typedef vector<int> vi;
typedef pair<int, int> ii;
 
int main(){
    int l, c, x, y;

    cin >> l >> c >> x >> y;


    string ans;

    if((c-1)&1){
        if(y&1)
            ans = "Esquerda";
        else
            ans = "Direita";
    }else{
        if(x&1){
            if(y&1)
                ans = "Direita";
            else
                ans = "Esquerda";
        }else{
            if(y&1)
                ans = "Esquerda";
            else    
                ans = "Direita";
        }
    }


    cout << ans << endl;

    return 0;
}
