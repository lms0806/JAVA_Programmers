class Solution {
    public int solution(int[] num_list) {
        int plus = 0, mul = 1;
        
        for(int n : num_list){
            plus += n;
            mul *= n;
        }
        
        return mul < Math.pow(plus, 2) ? 1 : 0;
    }
}
