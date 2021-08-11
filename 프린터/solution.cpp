#include <string>
#include <vector>

using namespace std;

int solution(vector<int> priorities, int location) {
    int answer = 0,cnt=0;
    while(1){
        int max=priorities[0];
        bool check=true;
        for(int i=1;i<priorities.size();i++){
            if(max<priorities[i]){
              check=false;
              break;
            }
        }
        if(check){
            if(&priorities[0]==&priorities[location]){
                return ++answer;
            }
            else{
                answer++;
                priorities.erase(priorities.begin());
                location=location!=0?--location:priorities.size()-1;
            }
        }
        else{
            priorities.push_back(priorities.front());
            priorities.erase(priorities.begin());
            location=location!=0?--location:priorities.size()-1;
        }
        cnt++;
    }
    return answer;
}