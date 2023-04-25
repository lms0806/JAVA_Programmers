class Solution {
    public int solution(int a, int b, int c) {
        if(a == b && b == c){
            return (a * 3) * ((a * a) * 3) * ((a * a * a) * 3);
        }
        else if((a == b && b != c) || (a != b && b == c) || (a == c && b != c)){
            return (a + b + c) * (a * a + b * b + c * c);
        }
        return a + b + c;
    }
}
