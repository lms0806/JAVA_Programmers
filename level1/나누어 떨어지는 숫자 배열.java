import java.util.*;

class Solution {
  public int[] solution(int[] arr, int divisor) {
      int[] num = new int[arr.length];
      int count = 0,count1 = 0;
      
      ArrayList<Integer> arraylist = new ArrayList<>();
      for(int i = 0; i < arr.length; i++){
          if(arr[i] % divisor == 0){
              arraylist.add(arr[i]);
          }
      }
      
      if(arraylist.size() == 0){
          int[] answer = new int[1];
          answer[0] = -1;
          return answer;
      }
      else{
          int[] answer = new int[arraylist.size()];
          for(int i = 0; i < answer.length; i++){
              answer[i] = arraylist.get(i);
          }
          
          Arrays.sort(answer);
          return answer;
      }
  }
}
