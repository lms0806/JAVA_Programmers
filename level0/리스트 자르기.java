import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        int s = n == 1 ? 0 : slicer[0], e = n == 2 ? num_list.length - 1 : slicer[1], idx = n == 4 ? slicer[2] : 1;
        
        for(int i = s; i <= e; i += idx){
            arr.add(num_list[i]);
        }
        
        int[] answer = new int[arr.size()];
        for(int i = 0; i < arr.size(); i++){
            answer[i] = arr.get(i);
        }
        return answer;
    }
}
