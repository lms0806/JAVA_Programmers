class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int size1 = arr1.length, size2 = arr2.length;
        
        if(size1 != size2){
            return size1 > size2 ? 1 : -1;
        }

        int a = 0, b = 0;
        for(int i = 0; i < size1; i++){
            a += arr1[i];
            b += arr2[i];
        }
        
        return a > b ? 1 : a == b ? 0 : -1;
    }
}
