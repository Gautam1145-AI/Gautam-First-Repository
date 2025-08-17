#include<iostream>
#include<stack>
using namespace std;

void reverseArray(int arr[], int size) {
    stack<int> s;
    for(int i = 0; i < size; i++) {
        s.push(arr[i]);
    }

    for(int i = 0; i < size; i++) {
        arr[i] = s.top();
        s.pop();
    }
}

void displayArray(int arr[], int size) {
    for(int i = 0; i < size; i++) {
        cout << arr[i] << " ";
    }
    cout << endl;
}

int main() {
    int arr[] = {10, 20, 30, 40, 50};
    int size = sizeof(arr) / sizeof(arr[0]);

    cout << "Original array: ";
    displayArray(arr, size);

    reverseArray(arr, size);

    cout << "Reversed array: ";
    displayArray(arr, size);

    return 0;
}
