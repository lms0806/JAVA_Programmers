import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        
        int min = 1, max = 0;
        
        for(int i = 0; i < arr.length-1; i++){
            for(int j = 1; j < arr[i]; j++){
                if(arr[i]%j == 0 && arr[i+1]%j == 0){
                    min = j;
                }
            }
            arr[i+1] = arr[i] * arr[i+1] / min;
        }
        
        answer = arr[arr.length-1];
        
        return answer;
    }
}
