import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        
        HashMap<String, Integer> count = new HashMap<>();
        HashMap<String, ArrayList<Integer>> list = new HashMap<>();
        
        for(int i = 0; i < id_list.length; i++) {
        	count.put(id_list[i], i);//각 사용자마다 번호 부여
        }
        
        for(int i = 0; i < report.length; i++) {
        	String[] s = report[i].split(" ");
        	
        	if(!list.containsKey(s[1])) {
        		list.put(s[1], new ArrayList<>());
        	} // 신고당한 적이 없으면 새로 리스트 생성
        	
        	ArrayList<Integer> temp = list.get(s[1]); // 신고한 사람의 리스트
        	if(!temp.contains(count.get(s[0]))) {
        		temp.add(count.get(s[0]));
        	}
        }
        
        for(int i = 0; i < id_list.length; i++) {
        	if(list.containsKey(id_list[i]) && list.get(id_list[i]).size() >= k) {
                //사용자 목록 중 신고당한적이 있고, 당한횟수가 k보다 크거나 같을 경우
        		for(int index : list.get(id_list[i])) {
        			answer[index]++;
        		}//신고당한 사람의 리스트가 가지고 있는 신고한 사람의 번호에 값 ++
        	}
        }
        
        return answer;
    }
}
