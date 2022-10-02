class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        
        int[] num = new int[200];
        for(int i = 0; i < lines.length; i++){
            for(int j = Math.min(lines[i][0], lines[i][1]); j < Math.max(lines[i][0], lines[i][1]); j++){
                num[j + 100]++;
            }
        }
        
        for(int n : num){
            if(n > 1){
                answer++;
            }
        }
        return answer;
    }
}
