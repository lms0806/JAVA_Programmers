class Solution {
  public String solution(String s) {
      String answer = "";
      String str = "";
      String[] a = s.split("");
      String[] b = a;
      String[] total = b;
      int num = 0;
      
      for(int i = 0; i < a.length; i++){
          for(int j = 0; j < b.length; j++){
              num = a[i].compareTo(b[j]);
              if(num > 0){
                  str = b[j];
                  b[j] = a[i];
                  a[i] = str;
              }
          }
      }
      
      for(int i = 0; i < b.length; i++){
          answer += b[i];
      }
      return answer;
  }
}
