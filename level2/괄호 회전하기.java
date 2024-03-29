import java.util.Stack;

class Solution {
    public boolean ischeck(char a, char b){
        return (a == '(' && b == ')') || (a == '{' && b == '}') || (a == '[' && b == ']');
    }
    public boolean isopen(char a){
        return a == '(' || a == '{' || a == '[';
    }
    public int solution(String s) {
        int answer = 0;
        
        for(int i = 0; i < s.length(); i++){
            int j;
            int a = 0;
            Stack<Character> stack = new Stack<>();
            for(j = 0; j < s.length(); j++){
                char ch = s.charAt(j);
                
                if(isopen(ch)){
                    if(a == 0 && stack.isEmpty()){
                        a = j;
                    }
                    stack.push(ch);
                }
                else{
                    if(stack.isEmpty() || !ischeck(stack.peek(),ch)){
                        break;
                    }
                    stack.pop();
                }
            }
            
            if(j == s.length() && stack.isEmpty()){
                answer++;
                s = s.substring(2) + s.substring(0,2);
                i++;
            }
            else{
                s = s.substring(1) + s.substring(0,1);
            }
        }
        return answer;
    }
}
