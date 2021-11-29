#include <string>
#include <vector>

using namespace std;

string solution(int n) {
    string answer = "";
    string one="수",two="박";
    bool check=true;
    for(int i=0;i<n;i++){
        if(check){answer+=one;check=!check;}
        else{answer+=two;check=!check;}
    }
    return answer;
}