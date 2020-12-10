import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        int a = 0, b = 0;
        int temp;
        
        Queue <Integer> pq = new PriorityQueue <Integer> (scoville.length);
        
        for(int i = 0; i < scoville.length; i++){
            pq.offer(scoville[i]);
        }
        
        while(pq.peek() < K){
            if(pq.size() == 1){
                answer = -1;
                break;
            }
            a = pq.poll();
            b = pq.poll();
            temp = a + (b*2);
            pq.offer(temp);
            answer++;
        }
        return answer;
    }
}
