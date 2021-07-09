class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.toLowerCase().split("");
        
        for(int i = 0; i < str.length; i++){
            answer += (i == 0 || str[i-1].equals(" ")) ? str[i].toUpperCase() : str[i];
        }
        return answer;
    }
}
