#include <bits/stdc++.h>

using namespace std;

#define pb push_back


int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);  

    int trem = 0, c, n;

    cin >> c >> n;

    bool flag = true;
    int sairam, entraram, ficaram;
    for(int i = 0; i < n; ++i){
        cin >> sairam >> entraram >> ficaram;

        
        if(sairam > trem)
            flag = false;        
        trem -= sairam;

        
        if((entraram + trem) > c)
            flag = false;
        trem += entraram;

        
        if(ficaram){
            if(trem != c)
                flag = false;
        }

    }
    
   
    flag && !trem ? cout << "possible\n":cout<<"impossible\n";

    return 0;
}
