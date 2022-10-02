class Solution {
    public int solution(int[][] dots) {
        
        int maxa = -256, mina = 256, maxb = -256, minb = 256;
        for(int i = 0; i < dots.length; i++){
            maxa = Math.max(maxa, dots[i][0]);
            mina = Math.min(mina, dots[i][0]);
            maxb = Math.max(maxb, dots[i][1]);
            minb = Math.min(minb, dots[i][1]);
        }
        
        return (maxa - mina) * (maxb - minb);
    }
}
