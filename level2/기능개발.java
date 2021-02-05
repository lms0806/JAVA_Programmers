import java.util.Stack;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] num = new int[progresses.length];
        
        for(int i = 0; i < progresses.length; i++){
            num[i] = (100 - progresses[i]) / speeds[i];
            if((100 - progresses[i]) % speeds[i] != 0){
                num[i]++;
            }
        }
        
        int count = 0;
        for(int i = 0; i < num.length; i++){
            for(int j = i+1; j < num.length; j++){
                if(num[j] != 0){
                    if(num[i] >= num[j]){
                        num[j] = 0;
                    }
                    else{
                        break;
                    }
                }
            }
        }
        
        Stack<Integer> st = new Stack<>();
        
        int number = 0;
        for(int i = num.length-1; i >= 0; i--){
            if(num[i] != 0){
                st.push(number+1);
                number = 0;
            }
            else{
                number++;
            }
        }
        
        int[] answer = new int[st.size()];
        
        for(int i = 0; i < answer.length; i++){
            answer[i] = st.pop();
        }
        
        return answer;
    }
}
