#include <iostream>
using namespace std;

int countGreaterThanY(const int arr[], int size, int Y) {
    int number = 0;
    for (int n = 0; n < size; ++n) {
        if (arr[n] > Y) {
            number++;
        }
    }
    return number;
}

int main() {
    int arr1[] = {2, 3, 5};
    int arr2[] = {2, 3, 5};
    int arr3[] = {4, 10, 15};
    int arr4[] = {4, 10, 15};
    int s1 = sizeof(arr1) / sizeof(arr1[0]);
    int s2 = sizeof(arr2) / sizeof(arr2[0]);
    int s3 = sizeof(arr3) / sizeof(arr3[0]);
    int s4 = sizeof(arr4) / sizeof(arr4[0]);

    int Y1 = 4;
    int Y2 = 1;
    int Y3 = 10;
    int Y4 = 20;

    int first = countGreaterThanY(arr1, s1, Y1);
    int second = countGreaterThanY(arr2, s2, Y2);
    int third = countGreaterThanY(arr3, s3, Y3);
    int fourth = countGreaterThanY(arr4, s4, Y4);

    cout << " " << first << endl;
    cout << " " << second << endl;
    cout << " " << third << endl;
    cout << " " << fourth << endl;

    return 0;
}

