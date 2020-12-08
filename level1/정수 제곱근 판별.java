class Solution {
  public long solution(long n) {
      long answer = 0;
      long num = 1;
      
      while(true){
          if(n == num*num){
              answer = (num+1)*(num+1);
              break;
          }
          else if(n < num*num){
              answer = -1;
              break;
          }
          num++;
      }
      return answer;
  }
}
