import java.util.*;

class Solution {
  public int[] solution(int[] arr, int divisor) {
      int[] num = new int[arr.length];
      int count = 0,count1 = 0;
      
      for(int i = 0; i < arr.length; i++){
          if(arr[i]%divisor == 0){
              num[i] = arr[i];
              count++;
              count1++;
          }
      }
      if(count1 == 0){
          count = 1;
      }
      int[] answer = new int[count];
      if(count == 1){
          answer[0] = -1;
      }
      count = 0;
      
      for(int i = 0; i < num.length; i++){
          if(num[i] != 0){
              answer[count] = num[i];
              count++;
          }
      }
      
      Arrays.sort(answer);
      return answer;
  }
}
