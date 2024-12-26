class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int time = changeTime(pos);
        
        int max = changeTime(video_len);
        int s = changeTime(op_start), e = changeTime(op_end);
        
        if(s <= time && time <= e){
            time = e;
        }
        
        for(String command : commands){
            if("next".equals(command)){
                time = Math.min(max, time + 10);
            }
            else {
                time = Math.max(0, time - 10);
            }
            
            if(s <= time && time <= e){
                time = e;
            }
        }
        return print(time / 60) + ":" + print(time % 60);
    }
    
    public static String print(int num){
        return String.format("%02d", num);
    }
    
    public static int changeTime(String str){
        String[] s = str.split(":");
        
        return Integer.parseInt(s[0]) * 60 + Integer.parseInt(s[1]);
    }
}
