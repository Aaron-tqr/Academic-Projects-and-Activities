#include <bits/stdc++.h>
using namespace std;

template <typename T>
T Max(T *pArr, int arrSize) {
    T element = pArr[0];
    for (int i = 1; i < arrSize; i++) {
        if (pArr[i] > element) {
            element = pArr[i];
        }
    }
    return element;
}

int main() {
    double Arr1[] = {20, 15, 6, 23, 30};
    double Arr2[] = {12.5, 3.1, 6.3, 4.2, 14.1};
    
    cout << Max(Arr1, 5) << endl; 
    cout << Max(Arr2, 5) << endl;

    return 0;
}

