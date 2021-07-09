import java.util.*;

class Solution {
  public String solution(String s) {
      String[] a = s.split(" ");
      int[] a1 = new int[a.length];

      for(int i = 0; i < a.length; i++){
          a1[i] = Integer.parseInt(a[i]);
      }
      
      Arrays.sort(a1);
      
      return Integer.toString(a1[0]) + " " + Integer.toString(a1[a1.length-1]);
  }
}
