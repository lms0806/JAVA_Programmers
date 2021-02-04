import java.util.HashMap;
import java.util.ArrayList;

class Solution {
    public String[] solution(String[] record) {
        ArrayList<String> arr = new ArrayList<>();
        
        HashMap<String, String> map = new HashMap<>();
        for(int i = 0; i < record.length; i++){
            String[] str = record[i].split(" ");
            
            if(str[0].equals("Change")){
                map.put(str[1], str[2]);
            }
            if(str[0].equals("Enter")){
                map.put(str[1], str[2]);
            }
        }
        
        for(int i = 0; i < record.length; i++){
            String[] str = record[i].split(" ");
            
            if(str[0].equals("Enter")){
                arr.add(map.get(str[1]) + "님이 들어왔습니다.");
            }
            else if(str[0].equals("Leave")){
                arr.add(map.get(str[1]) + "님이 나갔습니다.");
            }
        }
        
        String[] answer = new String[arr.size()];
        
        for(int i = 0; i < arr.size(); i++){
            answer[i] = arr.get(i);
        }
        return answer;
    }
}
