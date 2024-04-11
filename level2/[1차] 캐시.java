import java.util.ArrayList;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;

        ArrayList<String> arr = new ArrayList<>();
        for(int i = 0; i < cities.length; i++){
            String s = cities[i].toLowerCase();
            
            if(arr.contains(s)){
                arr.remove(s);
                arr.add(s);
                answer++;
            }
            else{
                arr.add(s);
                answer += 5;
                
                if(arr.size() > cacheSize){
                    arr.remove(0);
                }
            }
        }
        return answer;
    }
}
