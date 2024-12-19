class Solution {
    public int[] solution(int n, int s) {
        if(s < n){
            return new int[] {-1};
        }
        
        int[] answer = new int[n];
        for(int i = 0; i < n; i++){
            answer[i] = s / n;
        }
        
        if(s % n != 0){
            int num = s % n;
            for(int i = n - 1; i >= 0; i--){
                answer[i]++;
                
                if(--num == 0){
                    break;
                }
            }
        }
        return answer;
    }
}
