class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        boolean[] arr = new boolean[200001];
        
        for(int n : nums){
            if(!arr[n]){
                arr[n] = true;
                answer++;
            }
        }
        
        return Math.min(answer, nums.length / 2);
    }
}
