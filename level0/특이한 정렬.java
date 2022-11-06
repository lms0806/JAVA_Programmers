import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class Solution {
    public int[] solution(int[] numlist, int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int num : numlist) {
        	arr.add(num);
        }
        
        Collections.sort(arr, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				if(Math.abs(o1 - n) == Math.abs(o2 - n)) {
					return o2 - o1;
				}
				return Math.abs(o1 - n) - Math.abs(o2 - n);
			}
		});
        
        for(int i = 0; i < arr.size(); i++) {
        	numlist[i] = arr.get(i);
        }
        
        return numlist;
    }
}
