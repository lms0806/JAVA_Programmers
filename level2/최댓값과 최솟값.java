import java.util.*;

class Solution {
  public String solution(String s) {
      String answer = "";
      String[] a = s.split(" ");
      int[] a1 = new int[a.length];
      String b = "", b1 = "";
      
      for(int i = 0; i < a.length; i++){
          a1[i] = Integer.parseInt(a[i]);
      }
      
      Arrays.sort(a1);
      
      b = Integer.toString(a1[0]) + " ";
      b1 = Integer.toString(a1[a1.length-1]);
      
      answer = b+b1;
      
      return answer;
  }
}
