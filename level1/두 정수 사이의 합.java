class Solution {
  public long solution(int a, int b) {
      long answer = 0;
      int tmp = 0;
      
      if(a > b){
          tmp = a;
          a = b;
          b = tmp;
      }
      
      if(a != b){
          for(int i = a+1; i < b; i++){
              answer+=i;
          }
          answer+=a+b;
      }
      else{
          answer = b;
      }
      return answer;
  }
}
