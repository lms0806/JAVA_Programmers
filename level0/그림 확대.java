class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        
        for(int i = 0; i < picture.length * k; i++){
            StringBuilder sb = new StringBuilder();
            for(char c : picture[i / k].toCharArray()){
                for(int j = 0; j < k; j++){
                    sb.append(c);
                }
            }
            answer[i] = sb.toString();
        }
        return answer;
    }
}
