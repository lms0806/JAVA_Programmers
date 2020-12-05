class Solution {
  public String solution(String s) {
      String answer = "";
      int count = 0;
      
      if(s.length()%2 == 1){
          count = s.length()/2 +1;
          answer = s.substring(count-1,count);
      }
      else{
          count = s.length()/2;
          answer = s.substring(count-1, count+1);
      } 
      
      return answer;
  }
}
