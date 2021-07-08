class Solution {
  public String solution(String s) {
      String answer = "";
      String[] str = s.split("");
      int count = 0;
      
      for(String ss : str){
          if(ss.equals(" ")){
              answer += " ";
              count = 0;
              continue;
          }
          answer += count % 2 == 0 ? ss.toUpperCase() : ss.toLowerCase();
          count++;
      }
      return answer;
  }
}
