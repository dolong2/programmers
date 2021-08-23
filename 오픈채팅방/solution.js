function solution(record) {
    var answer = [];
    var user_name={};
    for(var i=0;i<record.length;i++){
        var act=record[i].split(' ');
        if(act[0]!="Leave"){
          user_name[act[1]]=act[2];
        }
    }
    for(var i=0;i<record.length;i++){
      var act=record[i].split(' ');
      if(act[0]==="Enter"){
        answer.push(user_name[act[1]]+"님이 들어왔습니다.");
      }
      else if(act[0]==="Leave"){
        answer.push(user_name[act[1]]+"님이 나갔습니다.");
      }
    }
    return answer;
}