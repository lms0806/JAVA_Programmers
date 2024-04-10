import java.util.TreeSet;

class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        
        int[] arr = new int[elements.length * 2];
        for(int i = 0; i < elements.length; i++){
            arr[i] = arr[i + elements.length] = elements[i];
        }
        
        TreeSet<Integer> set = new TreeSet<>();
        for(int i = 0; i < elements.length; i++){
            for(int j = 0; j < elements.length; j++){
                int sum = 0;
                for(int k = j; k < j + i; k++){
                    sum += arr[k];
                }
                
                set.add(sum);
            }
        }
        return set.size();
    }
}
