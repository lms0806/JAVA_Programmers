import java.util.*;

class Solution {
    static boolean[] visited;
    static ArrayList<String> road;
    public String[] solution(String[][] tickets) {
        visited = new boolean[tickets.length];
        road = new ArrayList<>();
        
        dfs("ICN", "ICN", tickets, 0);
        
        Collections.sort(road);
        
        return road.get(0).split(" ");
    }
    
    public static void dfs(String start, String rote, String[][] tickets, int count){
        if(count == tickets.length){
            road.add(rote);
            return;
        }
        
        for(int i = 0; i < tickets.length; i++){
            if(!visited[i] && tickets[i][0].equals(start)){
                visited[i] = true;
                dfs(tickets[i][1], rote + " " + tickets[i][1], tickets, count + 1);
                visited[i] = false;
            }
        }
    }
}
