#include<iostream>
using namespace std;

int main(){
    int UCLN(int a, int b){
        while(a != b){
            if(a > b){
                a = a - b;
            }else{
                b = b - a;
            }
        }
        return a;
    }

    int BCNN(int a, int b){
        int result = UCLN(a, b);
        return a * b / result;
    }

    int m;
    cin >> m;
    for(int i = 0; i < m; i++){
        int a, b;
        cin >> a >> b;
        cout << UCLN(a, b) << " " << BCNN(a, b);
    }
}