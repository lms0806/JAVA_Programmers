import java.util.TreeMap;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];
        
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int i = 0; i < operations.length; i++){
            String[] str = operations[i].split(" ");
            char ch = str[0].charAt(0);
            int n = Integer.parseInt(str[1]);
            
            if (ch == 'I') {
				map.put(n, !map.containsKey(n) ? 1 : 1 + map.get(n));
			} 
			else if (!map.isEmpty() && ch == 'D') {
				int number = n == 1 ? map.lastKey() : map.firstKey();
					
				if (map.get(number) == 1) {
					map.remove(number);
				} 
				else {
					map.put(number, map.get(number) - 1);
				}
			}
        }
        if(!map.isEmpty()){
            answer[0] = map.lastKey();
            answer[1] = map.firstKey();
        }
        return answer;
    }
}
