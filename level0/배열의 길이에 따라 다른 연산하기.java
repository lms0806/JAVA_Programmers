class Solution {
    public int[] solution(int[] arr, int n) {
        int size = arr.length;
        for(int i = 0; i < size; i++){
            if(size % 2 == 1 && i % 2 == 0){
                arr[i] += n;
            }
            else if(size % 2 == 0 && i % 2 == 1){
                arr[i] += n;
            }
        }
        return arr;
    }
}
