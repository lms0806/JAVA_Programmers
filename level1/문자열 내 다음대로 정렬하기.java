import java.util.ArrayList;
import java.util.Comparator;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        ArrayList<String> arr = new ArrayList<>();
        
        for(String str : strings){
            arr.add(str);
        }
        
        arr.sort(new Comparator<String>(){
            @Override
            public int compare(String str1, String str2) {
				return str1.charAt(n) - str2.charAt(n) == 0 ? 
						str1.compareTo(str2) : str1.charAt(n) - str2.charAt(n);
			}
        });
        
        for(int i = 0; i < answer.length; i++){
            answer[i] = arr.get(i);
        }
        return answer;
    }
}
