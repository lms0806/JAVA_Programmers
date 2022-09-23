class Solution {
    static int[] lion;
    static int[] answer = {-1};
    static int max = -1000;
    public int[] solution(int n, int[] info) {
        lion = new int[11];
        dfs(info, n, 1);
        return answer;
    }
    
    public static void dfs(int[] info, int n, int count){
        if(count == n + 1){
            int lionpoint = 0, apeachpoint = 0;
            for(int i = 0; i <= 10; i++){ 
                if(info[i] != 0 || lion[i] != 0){
                    if(lion[i] > info[i]){
                        lionpoint += 10 - i;
                    }  
                    else{
                        apeachpoint += 10 - i;
                    }
                }
            }
            
            if(lionpoint > apeachpoint){
                if(lionpoint - apeachpoint > max){
                    answer = lion.clone();
                    max = lionpoint - apeachpoint;
                }
                else if(lionpoint - apeachpoint == max){
                    answer = lion.clone();
                }
            }
            return;
        }
        
        for(int i = 0; i <= 10 && lion[i] <= info[i]; i++){
            lion[i]++;
            dfs(info, n, count + 1);
            lion[i]--;
        }
    }
}
