#include<string>
#include<stack>
#include <iostream>

using namespace std;

bool solution(string s)
{
    bool answer = false;
    stack<int> check;
    for(int i = 0;i<s.size();i++){
        if(s[i] == '(')
            check.push(1);
        else if(s[i] == ')'){
            if(check.empty())
                goto ans;
            check.pop();
        }
    }
    if(check.size() == 0)
        answer=true;
    ans:
    return answer;
}