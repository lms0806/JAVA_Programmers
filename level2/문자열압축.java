class Solution {
    public int solution(String s) {
        int answer = s.length();
        
        for(int i = 1; i <= s.length(); i++){
            int size = 1;
            String str = s.substring(0, i);
            StringBuilder result = new StringBuilder();
            for(int j = i; j <= s.length(); j += i){
                String strs = s.substring(j, j + i > s.length() ? s.length() : j + i);
                
                if(str.equals(strs)){
                    size++;
                }
                else{
                    result.append(size != 1 ? size : "").append(str);
                    str = strs;
                    size = 1;
                }
            }
            result.append(str);
            answer = Math.min(result.length(), answer);
        }
        return answer;
    }
}
