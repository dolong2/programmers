#include <string>
#include<array>
#include <vector>

using namespace std;

vector<int> solution(vector<int> answers) {
    vector<int> answer;
    vector<vector<int>> mf={{1,2,3,4,5},{2,1,2,3,2,4,2,5},{3,3,1,1,2,2,4,4,5,5}};
    int max_index[3]={0};
    int max=-1;
    for(int i=0;i<mf.size();i++){
        for(int j=0;j<answers.size();j++){
            if(mf[i][j%mf[i].size()]==answers[j]){
                max_index[i]++;
            }
        }
        if(max<max_index[i]){
            max=max_index[i];
        }
    }
    for(int i=0;i<3;i++){
        if(max_index[i]==max){
            answer.push_back(i+1);
        }
    }
    return answer;
}