class Solution {
  public int solution(int n) {
      int answer = 0;
      
      int[] number = new int[n+1];
      
      for(int i = 2; i <= n; i++){
          number[i] = i;
      }
      
      for(int i = 2; i <= n; i++){
          for(int j= 2*i; j<=n; j += i) {
              number[j] = 0;
          }
          if(number[i]!=0) {
              answer++;
          }
      }
      
      return answer;
  }
}
