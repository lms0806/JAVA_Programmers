import java.util.Arrays;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = new String[my_string.length()];
        
        for(int i = 0; i < my_string.length(); i++){
            answer[i] = my_string.substring(my_string.length() - i - 1);
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}
