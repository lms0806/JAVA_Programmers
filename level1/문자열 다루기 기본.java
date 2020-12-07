class Solution {
  public boolean solution(String s) {
      boolean answer = false;
      String a = s.replaceAll("[^0-9]", "");
      String[] str = a.split("");
      String[] str1 = s.split("");
      
      if((str1.length == 4 || str1.length == 6) && str.length == str1.length){
          answer = true;
      }
      
      return answer;
  }
}
