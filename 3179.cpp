#include <bits/stdc++.h>
 
using namespace std;

unsigned long long int power(unsigned long long int a){
    unsigned long long int result = 1;
    
    while(a > 0){
        result *= 2;
        a--;
    }
    
    return result;
}
 
int main() {
    unsigned long long int n, b;
    
    cin >> n >> b;
    
    
    if((power(b+1) - 1) >= n)
        cout << "yes\n";
    else
        cout << "no\n";
    return 0;
}
