import java.util.*;

class Solution {
    static char[] alpha = {'A', 'E', 'I', 'O', 'U'};
    static ArrayList<String> arr = new ArrayList<>();
    public int solution(String word) {
        dfs(0, "");
        Collections.sort(arr);
        
        return arr.indexOf(word) + 1;
    }
    
    public static void dfs(int depth, String words){
        if(depth >= 5){
            return;
        }
        
        for(int i = 0; i < alpha.length; i++){
            if(depth < 6){
                arr.add(words + alpha[i]);
                dfs(depth + 1, words + alpha[i]);
            }
        }
    }
}
