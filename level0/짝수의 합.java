class Solution {
    public int solution(int n) {
        int answer = 0;
        n++;
        while(n --> 0){
            if(n % 2 == 0){
                answer += n;
            }
        }
        return answer;
    }
}
