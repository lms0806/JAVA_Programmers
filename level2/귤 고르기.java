import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < tangerine.length; i++) {
        	map.put(tangerine[i], map.containsKey(tangerine[i]) ? map.get(tangerine[i]) + 1 : 1);
        }
        
        List<Map.Entry<Integer, Integer>> entryList = new LinkedList<>(map.entrySet());
        
        Collections.sort(entryList, new Comparator<Map.Entry<Integer, Integer>>() {
			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				// TODO Auto-generated method stub
				return o2.getValue().compareTo(o1.getValue());
			}
		});
        
        int count = 0;
        for(Map.Entry<Integer, Integer> entry : entryList) {
        	count += entry.getValue();
        	answer++;
        	if(count >= k) {
        		break;
        	}
        }
        return answer;
    }
}
