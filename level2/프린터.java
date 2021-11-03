import java.util.PriorityQueue;
import java.util.Collections;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 1;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int a : priorities){
            pq.add(a);
        }
        
        while(!pq.isEmpty()){
            for(int i = 0; i < priorities.length; i++){
                if(priorities[i] == pq.peek()){
                    if(location == i){
                        return answer;
                    }
                    answer++;
                    pq.poll();
                }
            }
        }
        
        return answer;
    }
}
