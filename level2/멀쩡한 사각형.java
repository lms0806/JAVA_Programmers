class Solution {
    public long solution(long w, long h) {
        return (w * h) - (w + h - gcd(w,h));
    }
    public long gcd(long w, long h){
        return (w == 0) ? h : gcd((h%w), w);
    }
}
