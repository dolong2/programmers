#include <string>
#include <vector>

using namespace std;

int solution(vector<int> numbers) {
    int answer = 0;
    int arr[10]={0};
    for(auto i : numbers){
        arr[i]=1;
    }
    for(int i=0;i<10;i++){
        answer+=arr[i]==0?i:0;
    }
    return answer;
}