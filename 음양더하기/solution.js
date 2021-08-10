function solution(absolutes, signs) {
    var answer = 0;
    for(var i=0;i<signs.length;i++){
        answer+=signs[i]?absolutes[i]:-1*absolutes[i];
    }
    return answer;
}