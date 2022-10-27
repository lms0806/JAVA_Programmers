class Solution {
     public static int solution(int[] ingredient) {
        int answer = 0;
        
        int[] arr = new int[ingredient.length];

        int idx = 0;
        for(int i = 0; i < ingredient.length; i++) {
        	arr[idx] = ingredient[i];
        	
        	if(idx >= 3) {
        		if(arr[idx - 3] == 1 && arr[idx - 2] == 2 && arr[idx - 1] == 3 && arr[idx] == 1) {
        			idx -= 4;
        			answer++;
        		}
        	}
        	idx++;
        }
        return answer;
    }
}
