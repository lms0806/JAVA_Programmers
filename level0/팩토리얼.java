class Solution {
    public int solution(int n) {
        int[] num = {1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800};
        
        int answer = 0;
        for(int i = 0; i < num.length; i++){
            if(n >= num[i]){
                answer = i + 1;
            }
        }
        return answer;
    }
}
