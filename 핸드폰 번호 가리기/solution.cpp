#include <string>
#include <vector>

using namespace std;

string solution(string phone_number) {
    int lastIdx = phone_number.length() - 4;
    if(lastIdx == 0)
        return phone_number;
    string star = "*";
    return phone_number.replace(0, lastIdx, star.append(lastIdx - 1, '*'));
}
