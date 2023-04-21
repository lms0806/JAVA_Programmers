class Solution {
    public int solution(int[] num_list, int n) {
        for(int num : num_list){
            if(n == num){
                return 1;
            }
        }
        return 0;
    }
}
