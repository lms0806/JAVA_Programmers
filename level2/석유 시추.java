import java.util.Queue;
import java.util.HashSet;
import java.util.LinkedList;

class Solution {
    static int n, m;
    static int[] arr;
    static boolean[][] visited;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    public int solution(int[][] land) {
        n = land.length;
        m = land[0].length;
        
        visited = new boolean[n][m];
        arr = new int[m];
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(!visited[i][j] && land[i][j] == 1){
                    bfs(i, j, land);
                }
            }
        }
        
        int answer = 0;
        for(int i = 0; i < m; i++){
            answer = Math.max(answer, arr[i]);
        }
        return answer;
    }
    
    public static void bfs(int x, int y, int[][] land){
        Queue<int[]> queue = new LinkedList<>();
        HashSet<Integer> set = new HashSet<>();
        queue.add(new int[] {x, y});
        visited[x][y] = true;
        set.add(y);
        
        int sum = 1;
        while(!queue.isEmpty()){
            int[] now = queue.poll();
            
            for(int i = 0; i < 4; i++){
                int nx = now[0] + dx[i];
                int ny = now[1] + dy[i];
                
                if(nx >= 0 && nx < n && ny >= 0 && ny < m){
                    if(!visited[nx][ny] && land[nx][ny] == 1){
                        queue.add(new int[] {nx, ny});
                        visited[nx][ny] = true;
                        set.add(ny);
                        sum++;
                    }
                }
            }
        }
        
        for(Integer key : set){
            arr[key] += sum;
        }
    }
}
