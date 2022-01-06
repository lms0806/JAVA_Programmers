class Solution {
    static int answer;
    public int solution(int k, int[][] dungeons) {
        boolean[] visited = new boolean[dungeons.length];
        dfs(k, dungeons, visited, 0);
        return answer;
    }
    
    public static void dfs(int k, int[][] dungeons, boolean[] visited, int count){
        if(count >= visited.length){
            answer = count;
            return;
        }
        
        for(int i = 0; i < dungeons.length; i++){
            if(visited[i]){
                continue;
            }
            
            if(k < dungeons[i][0]){
                answer = Math.max(answer, count);
                continue;
            }
            
            visited[i] = true;
            dfs(k - dungeons[i][1], dungeons, visited, count + 1);
            visited[i] = false;
        }
    }
}
