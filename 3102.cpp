
#include <bits/stdc++.h>

using namespace std;

double dist(int x1, int y1, int x2, int y2){
    return sqrt(pow(abs(x2 - x1), 2) + pow(abs(y2 - y1), 2));
}

int main(){
    int n;
    cin >> n;

    int x1, y1, x2, y2, x3, y3;
    double a, b, c, p, area;

  
    while(n--){
        cin >> x1 >> y1 >> x2 >> y2 >> x3 >> y3;

       
        a = dist(x1, y1, x2, y2);
        b = dist(x2, y2, x3, y3);
        c = dist(x3, y3, x1, y1);

        p = (a + b + c) / 2;
        area = sqrt(p * (p-a) * (p-b) * (p-c));

        cout << fixed << setprecision(3) << area << endl;
    }


    return 0;
}
