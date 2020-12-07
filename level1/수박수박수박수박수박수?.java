class Solution {
  public String solution(int n) {
      String answer = "";
      String a = "수";
      String a1 = "박";
      int i = 0;
      
      while(i != n){
          if(i%2 == 0){
              answer+=a;
          }
          else{
              answer+=a1;
          }
          i++;
      }
      return answer;
  }
}
