class Solution {
    public int solution(String number) {
        int answer = 0;
        
        for(char c : number.toCharArray()){
            answer += c - '0';
            
            answer %= 9;
        }
        
        return answer;
    }
}
