import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        Arrays.sort(score);
        
        for(int i = score.length - 1; i >= 0; i -= m) {
        	if(i - m + 1 < 0) {
        		break;
        	}
        	
        	answer += score[i - m + 1] * m;
        }
        
        return answer;
    }
}
