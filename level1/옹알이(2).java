import java.util.Arrays;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        String[] originalbablist = {"aya", "ye", "woo", "ma"};
        String[] repeatbablist = {"ayaaya", "yeye", "woowoo", "mama"};
        
        for(String bab : babbling){
            for(String rbab : repeatbablist){
                bab = bab.replace(rbab, "X");
            }
            
            for(String obab : originalbablist){
                bab = bab.replace(obab, "?");
            }
            
            boolean flag = false;
            for(int i = 0; i < bab.length(); i++){
                if(!bab.substring(i, i + 1).equals("?")){
                    flag = true;
                    break;
                }
            }
            
            if(!flag){
                answer++;
            }
        }
        return answer;
    }
}
