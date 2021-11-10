import java.util.Arrays;

class Solution {
    public int solution(int n, int[][] results) {
        int answer = 0;
        
        int[][] arr = new int[n + 1][n + 1];
        
        for(int i = 0; i <= n; i++){
            Arrays.fill(arr[i], 10000);
        }
        
        for(int i = 0; i < results.length; i++){
            arr[results[i][0]][results[i][1]] = 1;
        }
        
        for(int k = 1; k <= n; k++){
            for(int i = 1; i <= n; i++){
                for(int j = 1; j <= n; j++){
                    arr[i][j] = Math.min(arr[i][k] + arr[k][j], arr[i][j]);
                }
            }
        }
        
        for(int i = 1; i <= n; i++){
            boolean flag = true;
            for(int j = 1; j <= n; j++){
                if(i != j){
                    if(arr[i][j] == 10000 && arr[j][i] == 10000){
                        flag = false;
                        break;
                    }
                }
            }
            if(flag){
                answer++;
            }
        }
        
        return answer;
    }
}
