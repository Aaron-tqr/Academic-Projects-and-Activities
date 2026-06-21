#include <iostream>
using namespace std;

void makeItBig(int arr[], int size) {
    for (int n = 0; n < size; ++n) {
        if (arr[n] > 0) {
            arr[n] = 0;
        }
    }
}

int main() {
    int arrays[][4] = {
        {-1, 3, 5, -5},
        {2,4,6},
        {-4,0,4},
    };

    int sizes[] = {4, 3, 3};
    int numArrays = 3;

    int currentIndex = 0;

    for (int n = 0; n < numArrays; ++n) {
        int size = sizes[n];

        makeItBig(arrays[n], size);

        for (int z = 0; z < size; ++z) {
            if (arrays[n][z] == 0) {
                cout << "BIG ";
            } else {
                cout << arrays[n][z] << " ";
            }
        }

        currentIndex += size;
        cout << endl;
    }

    return 0;
}
