import java.util.Stack;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Integer> stack = new Stack<>();
        for(char i : s.toCharArray()){
            if(i == '(')
                stack.push(1);
            else if(i == ')'){
                if(stack.empty())
                    return false;
                stack.pop();
            }
        }
        if(!stack.empty())
            answer = false;
        return answer;
    }
}