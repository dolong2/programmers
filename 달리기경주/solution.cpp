#include <iostream>
#include <vector>
#include <unordered_map>

using namespace std;

vector<string> solution(vector<string> players, vector<string> callings) {
    unordered_map<string, int> indexMap;
    
    for (int i = 0; i < players.size(); ++i) {
        indexMap[players[i]] = i;
    }

    for (const auto& calling : callings) {
        int index = indexMap[calling];
        swap(players[index], players[index - 1]);
        indexMap[calling] = index - 1;
        indexMap[players[index]] = index;
    }

    return players;
}
