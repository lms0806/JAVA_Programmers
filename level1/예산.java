import java.util.*;

class Solution {
  public int solution(int[] d, int budget) {
      int answer = 0;
      int num = 0;
      
      Arrays.sort(d);
      
      for(int i = 0; i < d.length; i++){
          if(num+d[i] <= budget){
              num+=d[i];
              answer++;
          }
      }
      return answer;
  }
}
