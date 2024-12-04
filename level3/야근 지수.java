import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
    public long solution(int n, int[] works) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int w : works){
            pq.add(w);
        }
        
        while(n --> 0){
            if(pq.isEmpty()) {
                break;
            }
            
            if(pq.peek() == 1){
                pq.poll();
            }
            else {
                pq.add(pq.poll() - 1);
            }
        }
        
        long answer = 0;
        while(!pq.isEmpty()){
            answer += Math.pow(pq.poll(), 2);
        }
        return answer;
    }
}
