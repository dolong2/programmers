#include<iostream>
#include <string>
#include <vector>

using namespace std;
int rank_check(int num){
    switch(num){
        case 6:
            return 1;
        case 5:
            return 2;
        case 4:
            return 3;
        case 3:
            return 4;
        case 2:
            return 5;
        default:
            return 6;
    }
}
vector<int> solution(vector<int> lottos, vector<int> win_nums) {
    vector<int> answer;
    int zero_cnt=0;//0의 갯수를 센다
    int cnt=0;//일치하는 숫자의 갯수
    for(auto i : lottos){
        if(i==0){
            zero_cnt++;
            continue;
        }
        for(auto j : win_nums){
            if(i==j){
                cnt++;
            }
        }
    }
    int best=rank_check(cnt+zero_cnt),worst=rank_check(cnt);
    answer.push_back(best);
    answer.push_back(worst);
    return answer;
}