class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int sum = 0;
        int isTrue = 0;
        
        for(int i = 0; i < nums.length-2; i++){
            for(int j = i+1; j < nums.length-1; j++){
                for(int k = j+1; k < nums.length; k++){
                    sum = nums[i] + nums[j] + nums[k];
                    for(int z = 2; z < sum; z++){
                        if(sum % z == 0){
                            isTrue = 1;
                            break;
                        }
                    }
                    if(isTrue == 0){
                        answer++;
                    }
                    isTrue = 0;
                }
            }
        }
        return answer;
    }
}
