class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];
        
        int x = 0, y = 0;
        for(int i = 0; i < park.length; i++){
            for(int j = 0; j < park[0].length(); j++){
                if(park[i].charAt(j) == 'S'){
                    x = i;
                    y = j;
                    break;
                }
            }
        }
        
        char[] ch = {'N', 'E', 'S', 'W'};
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};
        for(int i = 0; i < routes.length; i++){
            String[] s = routes[i].split(" ");
            
            int idx = 0;
            for(int j = 0; j < ch.length; j++){
                if(ch[j] == s[0].charAt(0)){
                    idx = j;
                    break;
                }
            }
            
            int nowx = x, nowy = y;
            int n = Integer.parseInt(s[1]);
            while(n --> 0){
                int nx = x + dx[idx];
                int ny = y + dy[idx];
                
                if(nx >= 0 && nx < park.length && ny >= 0 && ny < park[0].length() && park[nx].charAt(ny) != 'X'){
                    x = nx;
                    y = ny;
                }
                else{
                    x = nowx;
                    y = nowy;
                    break;
                }
            }
        }
        answer[0] = x;
        answer[1] = y;
        return answer;
    }
}
