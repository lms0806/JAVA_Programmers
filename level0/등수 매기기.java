import java.util.Arrays;

class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        
        int[] sum = new int[score.length];
        for(int i = 0; i < score.length; i++) {
            sum[i] = score[i][0] + score[i][1];
        }
        
        int[] sum2 = sum.clone();
        
        Arrays.sort(sum2);
        
        int rank = 1;
        for(int i = sum2.length - 1; i >= 0; i--) {
        	for(int j = 0; j < sum.length; j++) {
        		if(sum[j] == sum2[i] && answer[j] == 0) {
        			answer[j] = rank;
        		}
        	}
        	rank++;
        }
        
        return answer;  
    }
}
