class Solution {
  public boolean solution(int x) {
      boolean answer = true;
      int num = x;
      int num1 = 0;
      
      while(x!=0){
          num1 += x%10;
          x/=10;
      }
      
      if(num%num1 != 0){
          answer = false;
      }
      return answer;
  }
}
