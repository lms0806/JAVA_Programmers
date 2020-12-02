import java.util.*;

public class Solution {
	public int[] solution(int []arr) {
        int count = 0;
        int[] arr1 = new int[arr.length];
        
        for(int i = 1; i < arr.length; i++){
            if(arr[i] == arr[i-1]){
                arr[i-1] = -1;
            }
        }
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != -1){
                count++;
            }
        }
        int[] answer = new int[count];
        int count1 = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != -1){
                answer[count1]=arr[i];
                count1++;
            }
        }

        return answer;
	}
}
