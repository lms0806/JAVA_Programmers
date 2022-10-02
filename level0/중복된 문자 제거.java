class Solution {
    public String solution(String my_string) {
        boolean[] check = new boolean[256];
        
        StringBuilder answer = new StringBuilder();
        for(char c : my_string.toCharArray()){
            if(!check[c]){
                answer.append(c);
            }
            check[c] = true;
        }
        
        return answer.toString();
    }
}
