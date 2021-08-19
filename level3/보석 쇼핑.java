import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public int[] solution(String[] gems) {
        int[] answer = {};
        
        HashSet<String> set = new HashSet<>();
        HashMap<String, Integer> map = new HashMap<>();
        
        for(String s : gems) {
        	set.add(s);
        }//입력받는 보석의 중복없는 갯수
        
        int m = Integer.MAX_VALUE, r = 0;
        for(int i = 0; i < gems.length; i++) {
        	while(r < gems.length) {
        		if(map.size() == set.size()) {
        			break;
        		}//보석의 갯수가 중복없는거랑 같을 경우
        		map.put(gems[r], map.containsKey(gems[r]) ? map.get(gems[r]) + 1 : 1);
                //gems 순서대로 추가하되 있으면 value++
        		r++;
        	}
        	if(map.size() == set.size() && m > r - i) {
        		m = r - i;//최대길이
        		answer = new int[2];//매번 리셋
        		answer[0] = i + 1;//최소
        		answer[1] = r;//최대
        	}//최대길이가 현재 측정한 거리보다 작고 총 갯수가 같을 때
        	map.put(gems[i], map.containsKey(gems[i]) ? map.get(gems[i]) - 1 : 1);
            //i를 증가시키므로 i번째 글자를 1 뺀다.
        	if(map.get(gems[i]) == 0) {
        		map.remove(gems[i]);
        	}//글자를 포함하고 있지 않을 경우 없애버리기
        }
        return answer;
    }
}
