#include <string>
#include <vector>
#include<queue>
#include<iostream>
using namespace std;

int solution(vector<int> scoville,int k){
    priority_queue<int,vector<int>,greater<int> > q(scoville.begin(),scoville.end());
    int answer = 0,r=0,r1=0;
    r=q.top();
    if(r<k){
        while (1){
       if(q.size() == 1){
            if(k>q.top()){
                return -1;
            }
           else {
               return answer;
           }
       }
       if(q.size() == 0){
           return -1;
       }
            
            
            
        r=q.top();
        if(r>=k){
            break;
        }
            q.pop();
            r1=q.top();
            q.pop();
            q.push(r+(r1*2));
            ++answer;
        }
            return answer;
    }
    else {
        return 1;
    }
}