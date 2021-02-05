class Solution {
    int solution(int[][] land) {
        int answer = 0;
        
        int[][] dp = new int[100001][4];
        
        int r = land.length;
        
        for(int i = 0; i < 4; i++){
            dp[0][i] = land[0][i];//첫줄에는 land의 첫줄에 있는 것들 입력
        }
        
        for(int i = 1; i < r; i++){
            for(int j = 0; j < 4; j++){
                for(int k = 0; k < 4; k++){
                    if(j != k){
                        dp[i][j] = Math.max(dp[i][j], land[i][j] + dp[i-1][k]);
                        //최고로 점수가 많아지는 경우를 적어놓음
                    }
                }
            }// j == 전꺼, k == 현재꺼
        }
        
        for(int i = 0; i < 4; i++){
            answer = Math.max(answer, dp[r-1][i]);//경우의 수 중 가장 큰거 가져오기
        }

        return answer;
    }
}
