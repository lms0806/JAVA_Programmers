class Solution {
    public long solution(long k, long d) {
        long answer = 0;
        for(long i = 0; i <= d; i += k){
            long num = (long) Math.sqrt(d * d - i * i); 
            answer += num / k + 1;
        }
        return answer;
    }
}
