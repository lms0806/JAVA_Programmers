class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        
        int idx = 0;
        while(k --> 1){
            idx += 2;
            
            if(idx >= numbers.length){
                idx -= numbers.length;
            }
        }
        return idx + 1;
    }
}
