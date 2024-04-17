import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        
        for(int i = 0; i < topping.length; i++){
            if(map.containsKey(topping[i])){
                map.put(topping[i], map.get(topping[i]) + 1);
            }
            else{
                map.put(topping[i], 1);
            }
        }
        
        for(int t : topping){
            map.put(t, map.get(t) - 1);
            set.add(t);
            
            if(map.get(t) == 0){
                map.remove(t);
            }
            if(map.size() == set.size()){
                answer++;
            }
        }
        return answer;
    }
}
