function solution(answers) {
  var answer = [];
  var mfp=[[1, 2, 3, 4, 5],[2, 1, 2, 3, 2, 4, 2, 5],[3, 3, 1, 1, 2, 2, 4, 4, 5, 5]];//mathforgiveperson
  var max=-1;
  var mfp_bingo=[0,0,0]; //맞춘개수
  for(var i=0;i<mfp.length;i++){
      for(var j=0;j<answers.length;j++){
          if(answers[j]==mfp[i][j%mfp[i].length]){
              mfp_bingo[i]++;
          }
      }
      if(max<mfp_bingo[i]){
        max=mfp_bingo[i];
      }
  }
  for(var i=0;i<3;i++){
    if(max==mfp_bingo[i]){
      answer.push(i+1);
    }
  }
  return answer;
}