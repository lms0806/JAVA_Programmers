class Solution {
    public int solution(String binomial) {
        String[] s = binomial.split(" ");
        
        int a = Integer.parseInt(s[0]), b = Integer.parseInt(s[2]);
        if(s[1].equals("+")){
            return a + b;
        }
        else if(s[1].equals("-")){
            return a - b;
        }
        return a * b;
    }
}
