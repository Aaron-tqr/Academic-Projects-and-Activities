#include<iostream>
using namespace std;

void sigma (int num);
int main(){
	
	sigma(3);
	sigma(5);
	sigma(6);
	sigma(8);
	
	return 0;
}
void sigma (int number){
	int x = 0;
	for(int n = 1; n <= number; n++){
		x += n;
	}
	cout<<x<<endl;
}

