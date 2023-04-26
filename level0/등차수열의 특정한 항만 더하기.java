class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int idx = 0;
        while(idx < included.length){
            if(included[idx++]){
                answer += a;
            }
            
            a += d;
        }
        return answer;
    }
}
