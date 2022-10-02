import java.util.ArrayList;

class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] str = s.split(" ");
        
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < str.length; i++){
            if(str[i].equals("Z")){
                if(arr.size() != 0){
                    arr.remove(arr.size() - 1);
                }
            }
            else{
                arr.add(Integer.parseInt(str[i]));
            }
        }
        
        for(int a : arr){
            answer += a;
        }
        return answer;
    }
}
