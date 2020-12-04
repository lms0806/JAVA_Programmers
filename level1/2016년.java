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
      b-=1;
      switch(b%7){
          case 0:
              answer = "FRI";
              break;
          case 1:
              answer = "SAT";
              break;
          case 2:
              answer = "SUN";
              break;
          case 3:
              answer = "MON";
              break;
          case 4:
              answer = "TUE";
              break;
          case 5:
              answer = "WED";
              break;
          case 6:
              answer = "THU";
              break;
      }
      return answer;
  }
}
