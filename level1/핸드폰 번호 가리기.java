class Solution {
  public String solution(String phone_number) {      
      return phone_number.substring(0,phone_number.length()-4).replaceAll(".","*") + phone_number.substring(phone_number.length()-4);
  }
}
