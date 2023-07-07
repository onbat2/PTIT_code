#include<bits/stdc++.h>
using namespace std;

int n; a[100], ok;

void khoi_tao(){
	for(int i = 0; i <= n; i++){
		a[i] = '0';
	}
}

void sinh(){
	int i = n - 1;
	while(int i >= 0 && a[i] == "1"){
		a[i] = 0;
		--i;
	}if(i < 0){
		ok = 0;
	}else{
		a[i] = 1;
	}
}

int main(){
	cin >> n;
	ok = 1;
	khoi_tao();
	while(ok){
		for(int i = 0; i < n; i++){
			cout << a[i] << " ";
		}
		cout << endl;
		sinh();
	}
	return 0;
}
