#include<iostream>
#include<vector>
using namespace std;
 int main(){
    int arr[5];
    int n = 5;
    for(int i = 0;i<n;i++){
        cin>>arr[i];
    }

    // Bubble sort
    // for(int i = 0;i<n-1;i++){ // n-1 passes 
    //     for(int j=0;j<n-1-i;j++){ // Traverse
    //         if(arr[j]>arr[j+1]){
    //             swap(arr[j],arr[j+1]);//Swaping
    //         }
    //     }
    // }
    
    for(int i = 0;i<n-1;i++){ // n-1 passes
        bool flag = true; 
        for(int j=0;j<n-1-i;j++){ // j<n-1-i so that more optimize way 
            if(arr[j]>arr[j+1]){
                swap(arr[j],arr[j+1]);
                flag = false;
            }
        }                                  
        if(flag == true){// swap didin't happened
            break;
        }
    }
    cout<<endl;
    for(int i = 0;i<n;i++){
        cout<<arr[i]<<" ";
    }

    return 0;
}