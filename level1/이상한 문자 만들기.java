class Solution {
  public String solution(String s) {
      String answer = "";
      String[] str = s.split("");
      int count = 0;
      
      for(int i = 0; i < s.length(); i++){
          if(s.charAt(i) == ' '){
              answer += " ";
              count = 0;
              continue;
          }
          else if(count%2 == 0){
              answer += str[i].toUpperCase();
          }
          else if(count%2 == 1){
              answer += str[i].toLowerCase();
          }
          count++;
      }
      return answer;
  }
}
