import java.util.TreeSet;
import java.util.Arrays;

class Solution {
    public int solution(String[] strs, String t) {
        int INF = 987654321;
        int[] dp = new int[20001];
        int len = t.length();
        
        TreeSet<String> arr = new TreeSet<>(Arrays.asList(strs));//배열에 있는거 set
        
        for(int i = 0; i < len; i++){
            dp[i] = INF;
        }//글자의 크기만큼 dp에 무한대 입력
        
        dp[len] = 0;
        
        for(int i = len - 1; i >= 0; i--){
            String temp = "";
            for(int j = 0; i + j < len && j < 5; j++){
                temp += t.substring(i+j,i+j+1);//뒤에서부터 1글자씩 추가
                if(arr.contains(temp) && dp[i + j + 1] != INF){//글자가 배열에 있고, 그 글자 뒤에 수가 무한이 아닐시
                    dp[i] = Math.min(dp[i], dp[i + j + 1] + 1);//그 중 작은거 선택
                }
            }
        }
        
        if(dp[0] == INF){
            return -1;
        }//dp0이 무한이면 만들 수 없다.
        else{
            return dp[0];
        }
    }
}
