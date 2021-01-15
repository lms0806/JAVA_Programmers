class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int count = 0;
        
        if(s.charAt(0) == ')' || s.charAt(s.length()-1) == '('){
            answer = false;
        }
        else{
            for(int i = 0; i < s.length(); i++){
                char c = s.charAt(i);
                if(c == '('){
                    count++;
                }
                else if(count >= 1 && c == ')'){
                    count--;
                }
                if(count >= s.length()-i){
                    answer = false;
                    break;
                }
            }
        }

        return answer;
    }
}
