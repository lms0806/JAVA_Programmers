import java.util.TreeMap;
import java.util.ArrayList;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int i = 0; i < rank.length; i++){
            map.put(rank[i], i);
        }
        
        ArrayList<Integer> arr = new ArrayList<>();
        for(Integer key : map.keySet()){
            if(attendance[map.get(key)]){
                arr.add(map.get(key));
                
                if(arr.size() == 3){
                    break;
                }
            }
        }
        return arr.get(0) * 10000 + arr.get(1) * 100 + arr.get(2);
    }
}
