#include<iostream>
#include<vector>
#include<string>
using namespace std;
 int main(){
    string s = "AZXYBCYGYZX";
    string str;

    for(int i = 0;i<s.length();i++){
        if(s[i]>='X'){
            str.push_back(s[i]);
        }
    }
    cout<<str;
    
    for(int i = 0;i<str.length()-1;i++){ // n-1 passes
        bool flag = true; 
        for(int j=0;j<str.length()-1-i;j++){ // j<n-1-i so that more optimize way 
            if(str[j]>str[j+1]){
                swap(str[j],str[j+1]);
                flag = false;
            }
        }                                  
        if(flag == true){// swap didin't happened
            break;
        }
    }
    cout<<endl;
    for(int i = 0;i<str.length();i++){
        cout<<str[i]<<" ";
    }

    return 0;
}