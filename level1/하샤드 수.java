class Solution {
  public boolean solution(int x) {
      int num = x, num1 = 0;
      
      while(x != 0){
          num1 += x % 10;
          x /= 10;
      }
      
      return num % num1 != 0 ? false : true;
  }
}
