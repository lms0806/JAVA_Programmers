import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        
        Arrays.fill(answer, -1);
        
        int idx = 0;
        boolean[] flag = new boolean[100001];
        for(int i = 0; i < arr.length; i++){
            if(!flag[arr[i]]){
                flag[arr[i]] = true;
                answer[idx++] = arr[i];
                
                if(idx == k){
                    break;
                }
            }
        }
        return answer;
    }
}
