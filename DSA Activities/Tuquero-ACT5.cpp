#include <iostream>
using namespace std;

void reverseArray(int arr[], int size) {
    for (int n = 0; n < size / 2; ++n) {
        int s = arr[n];
        arr[n] = arr[size - 1 - n];
        arr[size - 1 - n] = s; 
    }
}

int main() {
    int arr1[] = {1, 3, 5};
    int arr2[] = {-1, 3, -5};
    int arr3[] = {1, 2, 3, 4, 5};
    int arr4[] = {2, 10, 13, 15};
    int s1 = sizeof(arr1) / sizeof(arr1[0]);
    int s2 = sizeof(arr2) / sizeof(arr2[0]);
    int s3 = sizeof(arr3) / sizeof(arr3[0]);
    int s4 = sizeof(arr4) / sizeof(arr4[0]);

    reverseArray(arr1, s1);
    reverseArray(arr2, s2);
    reverseArray(arr3, s3);
    reverseArray(arr4, s4);

    cout << " ";
    for (int a = 0; a < s1; ++a) {
        cout << arr1[a] << " ";
    }
    cout << endl;

    cout << " ";
    for (int b = 0; b < s2; ++b) {
        cout << arr2[b] << " ";
    }
    cout << endl;

    cout << " ";
    for (int c = 0; c < s3; ++c) {
        cout << arr3[c] << " ";
    }
    cout << endl;

    cout << " ";
    for (int d = 0; d < s4; ++d) {
        cout << arr4[d] << " ";
    }
    cout << endl;

    return 0;
}

