class Solution {
  public int[] solution(int n, int m) {
      int[] answer = new int[2];
      int temp = 1;
      int a = n, b = m;
      
      if(n > m){
          a = m;
          b = n;
      }
      while(temp != 0){
          temp = b%a;
          b = a;
          a = temp;
      }
      
      answer[0] = b;
      answer[1] = m*n/answer[0];
      
      return answer;
  }
}
