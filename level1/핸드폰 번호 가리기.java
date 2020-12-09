class Solution {
  public String solution(String phone_number) {
      String answer = "";
      String a = phone_number.substring(phone_number.length()-4,phone_number.length());
      String a1 = phone_number.substring(0,phone_number.length()-4);
      
      a1 = a1.replaceAll(".","*");
      
      answer= a1+a;
      return answer;
  }
}
