class Solution {
  public String solution(int a, int b) {
      int[] num = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
      
      for(int i = 1; i < a; i++){
          b += num[i-1];
      }
      
      String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
      
      return day[(b-1)%7];
  }
}
