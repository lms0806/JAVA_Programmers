import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int solution(int[] picks, String[] minerals) {
        ArrayList<Node> arr = new ArrayList<>();
        
        int size = Math.min(minerals.length, (picks[0] + picks[1] + picks[2]) * 5);
        
        for(int i = 0; i < size; i += 5){
            int di = 0, ir = 0, st = 0;
            for(int j = i; j < Math.min(i + 5, size); j++){
                if(minerals[j].equals("diamond")){
                    ir += 5;
                    st += 25;
                }
                else if(minerals[j].equals("iron")){
                    ir++;
                    st += 5;
                }
                else{
                    ir++;
                    st++;
                }
                
                di++;
            }
            
            arr.add(new Node(di, ir, st));
        }
        
        Collections.sort(arr, ((o1, o2) -> (o2.stone - o1.stone)));
        
        int answer = 0;
        for(Node now : arr){
            int di = now.diamond, ir = now.iron, st = now.stone;
            
            if(picks[0] > 0){
                answer += di;
                picks[0]--;
            }
            else if(picks[1] > 0){
                answer += ir;
                picks[1]--;
            }
            else if(picks[2] > 0){
                answer += st;
                picks[2]--;
            }
        }
        return answer;
    }
}

class Node {
    int diamond, iron, stone;
    
    public Node(int diamond, int iron, int stone){
        this.diamond = diamond;
        this.iron = iron;
        this.stone = stone;
    }
}
