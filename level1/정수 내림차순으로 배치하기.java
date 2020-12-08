import java.util.*;

class Solution {
  public long solution(long n) {
      long answer = 0;
      String str = "";
      String[] num = new String[(int)Math.log10(n)+1];
      
      int a = 0;
      while(n!=0){
          num[a] = Long.toString(n%10);
          n/=10;
          a++;
      }
      
      Arrays.sort(num);
      
      for(int i = num.length-1; i >= 0; i--){
          str+=num[i];
      }
      answer = Long.parseLong(str);
      return answer;
  }
}
