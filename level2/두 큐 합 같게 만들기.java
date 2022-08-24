import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        Queue<Integer> q1 = new LinkedList<>(), q2 = new LinkedList<>();
        
        long sum1 = 0, sum2 = 0;
        for(int i = 0;  i < queue1.length; i++){
            sum1 += queue1[i];
            sum2 += queue2[i];
            q1.add(queue1[i]);
            q2.add(queue2[i]);
        }
        
        if((sum1 + sum2) % 2 == 1){
            return -1;
        }
        
        for(int i = 0; i < queue1.length * 3; i++){
            if(sum1 < sum2){
                int num = q2.poll();
                sum1 += num;
                sum2 -= num;
                q1.add(num);
            }
            else if(sum2 < sum1){
                int num = q1.poll();
                sum2 += num;
                sum1 -= num;
                q2.add(num);
            }
            else{
                return i;
            }
        }
        return -1;
    }
}
