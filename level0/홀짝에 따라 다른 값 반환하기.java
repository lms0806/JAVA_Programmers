class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int idx = n % 2 == 0 ? 2 : 1;
        for(int i = idx; i <= n; i += 2){
            answer += n % 2 == 0 ? Math.pow(i, 2) : i;
        }
        
        return answer;
    }
}
