#include <string>
#include <vector>

using namespace std;

int measure(int n){
    int cnt=0;
    for (int i = 1; i * i <= n; i++) {
        if (n % i == 0) { 
            cnt++; 
            if (i * i < n) {
                cnt++; 
            } 
        } 
    }
    if(!(cnt%2)){
        return 1;
    }
    else{
        return -1;
    }
}

int solution(int left, int right) {
    int answer = 0;
    for(int i=left;i<=right;i++){
        answer+=(measure(i)*i);
    }
    return answer;
}