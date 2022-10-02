import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        
        Arrays.sort(array);
        
        int num = Integer.MAX_VALUE;
        for(int i = array.length - 1; i >= 0; i--){
            if(num > Math.abs(array[i] - n)){
                num = Math.abs(array[i] - n);
                answer = array[i];
            }
            else if(num == Math.abs(array[i] - n)){
                answer = array[i];
            }
        }
        return answer;
    }
}
