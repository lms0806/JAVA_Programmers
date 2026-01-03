import java.util.HashMap;
import java.util.ArrayList;
import java.util.PriorityQueue;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        HashMap<String, Integer> map = new HashMap<>();
        PriorityQueue<Node> pq = new PriorityQueue<>();
        
        for(int i = 0; i < genres.length; i++){            
            map.put(genres[i], map.getOrDefault(genres[i], 0) + plays[i]);
        }
        
        for(int i = 0; i < genres.length; i++){
            pq.add(new Node(map.get(genres[i]), i, plays[i]));
        }
        
        ArrayList<Integer> arr = new ArrayList<>();
        while(!pq.isEmpty()){
            int total = pq.peek().max;

            for (int i = 0; i < 2; i++) {
                if (pq.isEmpty() || pq.peek().max != total) {
                    break;
                }
                arr.add(pq.poll().idx);
            }

            while (!pq.isEmpty() && pq.peek().max == total) {
                pq.poll();
            }
        }
        
        int[] answer = new int[arr.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = arr.get(i);
        }
        return answer;
    }
}

class Node implements Comparable<Node> {
    int max, idx, num;
    
    public Node(int max, int idx, int num){
        this.max = max;
        this.idx = idx;
        this.num = num;
    }
    
    @Override
    public int compareTo(Node o){
        if(this.max == o.max){
            if(this.num == o.num){
                return this.idx - o.idx;
            }
            return o.num - this.num;
        }
        return o.max - this.max;
    }
}
