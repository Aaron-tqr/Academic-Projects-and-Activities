#include <iostream>
using namespace std;

void doubleArray(int arr[], int size) {
    for (int n = 0; n < size; ++n) {
        arr[n] *= 2;
    }
}

int main() {
    int inputArray1[] = {1, 2, 3};
    int inputArray2[] = {-2, 0, 2};
    int inputArray3[] = {2, 10, 100};
    int s1 = sizeof(inputArray1) / sizeof(inputArray1[0]);
    int s2 = sizeof(inputArray2) / sizeof(inputArray2[0]);
    int s3 = sizeof(inputArray3) / sizeof(inputArray3[0]);

    doubleArray(inputArray1, s1);
    doubleArray(inputArray2, s2);
    doubleArray(inputArray3, s3);

    cout << " ";
    for (int n = 0; n < s1; ++n) {
        cout << inputArray1[n] << " ";
    }
    cout << endl;

    cout << " ";
    for (int n = 0; n < s2; ++n) {
        cout << inputArray2[n] << " ";
    }
    cout << endl;

    cout << " ";
    for (int n = 0; n < s3; ++n) {
        cout << inputArray3[n] << " ";
    }

    return 0;
}

