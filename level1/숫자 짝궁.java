class Solution {
    public String solution(String X, String Y) {
        int[] xnum = new int[10], ynum = new int[10];
        
        for(char c : X.toCharArray()){
            xnum[c - '0']++;
        }
        for(char c : Y.toCharArray()){
            ynum[c - '0']++;
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = 9; i >= 0; i--){
            if(sb.length() == 0 && i == 0 && Math.min(xnum[i], ynum[i]) != 0){
                sb.append(0);
                break;
            }
            sb.append((i + "").repeat(Math.min(xnum[i], ynum[i])));
        }
        
        String answer = sb.toString();
        return answer.equals("") ? "-1" : answer;
    }
}
