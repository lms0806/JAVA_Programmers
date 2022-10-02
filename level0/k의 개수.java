class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for(int n = i; n <= j; n++){
            String s = String.valueOf(n);
            for(char c : s.toCharArray()){
                if(c - '0' == k){
                    answer++;
                }
            }
        }
        return answer;
    }
}
