class Solution {
  public String solution(int a, int b) {
      String answer = "";
      
      for(int i = 1; i < a; i++){
          if(i%2 == 1 && i < 8){
              b+=31;
          }
          else if(i%2 == 0 && i < 8 && i != 2){
              b+=30;
          }
          else if(i == 2){
              b+=29;
          }
          else if(i%2 == 1 && i >= 8){
              b+=30;
          }
          else if(i%2 == 0 && i >= 8){
              b+=31;
          }
      }
      
      String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
      answer = day[(b-1)%7];
      
      return answer;
  }
}
