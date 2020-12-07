class Solution {
  public String solution(String s, int n) {
      String answer = "";
      
      byte[] bte = new byte[s.length()];
      
      for(int i = 0; i < s.length(); i++){
          bte[i] = (byte)s.charAt(i);
          if(bte[i] != 32){
              for(int j = 0; j < n; j++){
                  bte[i]++;
                  if(bte[i] == 123){
                      bte[i] = 97;
                  }//소문자
                  if(bte[i] == 91){
                      bte[i] = 65;
                  }//대문자
              }
          }
          if(bte[i] == 123){
              bte[i] = 97;
          }
      }
      
      for(int i = 0; i < s.length(); i++){
          answer += (char)bte[i];
      }
      return answer;
  }
}
