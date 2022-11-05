class Solution {
    public int[] solution(int denum1, int num1, int denum2, int num2) {
        int[] answer = new int[2];
        
        int lcm = num1 * num2 / gcd(num1, num2);
        
        denum1 *= lcm / num1;
        denum2 *= lcm / num2;
        
        int denum = denum1 + denum2;
        
        int gcddenum = gcd(denum, lcm);
        
        return new int[] {denum / gcddenum, lcm / gcddenum};
    }
    
    public static int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        return gcd(b, a % b);
    }
}
