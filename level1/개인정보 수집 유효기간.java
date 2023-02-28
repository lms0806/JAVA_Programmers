import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> arr = new ArrayList<>();
		
		String[] todays = today.split("\\.");
		int todayy = Integer.parseInt(todays[0]), todaym = Integer.parseInt(todays[1]), todayd = Integer.parseInt(todays[2]);
		
		HashMap<String, Integer> map = new HashMap<>();
		for(int i = 0; i < terms.length; i++) {
			String[] term = terms[i].split(" ");
			
			map.put(term[0], Integer.parseInt(term[1]));
		}
		
		for(int i = 0; i < privacies.length; i++) {
			String[] privacie = privacies[i].split(" ");
			String[] privacieday = privacie[0].split("\\.");
			
			int privaciey = Integer.parseInt(privacieday[0]);
			int privaciem = Integer.parseInt(privacieday[1]) + map.get(privacie[1]);
			int privacied = Integer.parseInt(privacieday[2]);
			
			while(privaciem > 12) {
				privaciem -= 12;
				privaciey++;
			}
			
			if(privaciey < todayy) {
				arr.add(i + 1);
			}
			else if(privaciey == todayy) {
				if(privaciem < todaym) {
					arr.add(i + 1);
				}
				else if(privaciem == todaym) {
					if(privacied <= todayd) {
						arr.add(i + 1);
					}
				}
			}
		}
		
        int[] answer = new int[arr.size()];
        for(int i = 0; i < arr.size(); i++) {
        	answer[i] = arr.get(i);
        }
        return answer;
    }
}
