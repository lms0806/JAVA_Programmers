import java.util.Stack;

class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        
        for(int a : arr){
            if(stack.isEmpty()){
                stack.add(a);
            } 
            else {
                if(stack.peek() == a){
                    stack.pop();
                }
                else {
                    stack.add(a);
                }
            }
        }
        
        if(stack.size() == 0){
            return new int[] {-1};
        }
        
        int idx = stack.size() - 1;
        int[] answer = new int[stack.size()];
        while(!stack.isEmpty()){
            answer[idx--] = stack.pop();
        }
        return answer;
    }
}
