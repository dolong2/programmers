function solution(array, commands) {
    var answer = [];
    var temp =[];
    for(var i=0;i<commands.length;i++){
        temp=array.slice(commands[i][0]-1,commands[i][1]);
        temp.sort((a,b)=>{
            if(a>b)return 1;
            else if(a===b)return 0;
            else return -1;
        });
        answer.push(temp[commands[i][2]-1]);
    }
    return answer;
}