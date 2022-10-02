class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int num = 0;
        boolean flag = true;
        if(common[2] - common[1] == common[1] - common[0]){
            num = common[2] - common[1];
        }
        else{
            num = common[2] / common[1];
            flag = false;
        }
        return flag ? common[common.length - 1] + num : common[common.length - 1] * num;
    }
}
