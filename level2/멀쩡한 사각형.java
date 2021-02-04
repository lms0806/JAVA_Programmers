class Solution {
    public long solution(long w, long h) {
        long answer;
    
        answer = (w * h) - (w + h - gcd(w,h));
        
        return answer;
    }
    public long gcd(long w, long h){
        if(w == 0){
            return h;
        }
        else{
            return gcd((h%w), w);
        }
    }
}
