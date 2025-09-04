class Solution {
    public int solution(int[][] dots) {
        return solve(dots[0], dots[1], dots[2], dots[3]) || solve(dots[0], dots[2], dots[1], dots[3]) || solve(dots[0], dots[3], dots[1], dots[2]) ? 1 : 0;
    }
    
    public static boolean solve(int[] a, int[] b, int[] c, int[] d){
        return (a[0] - b[0]) * (c[1] - d[1]) == (c[0] - d[0]) * (a[1] - b[1]);
    }
}
