class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int idx = 0, time = 0, maxHealth = health;
        for(int i = 0; i <= attacks[attacks.length - 1][0]; i++){
            if(i == attacks[idx][0]){
                health -= attacks[idx][1];
                time = attacks[idx][0];
                idx++;
                
                if(health <= 0){
                    return -1;
                }
            }
            else{
                health = Math.min(maxHealth, health + bandage[1]);
            }
            
            if(time + bandage[0] <= i){
                health = Math.min(maxHealth, health + bandage[2]);
                time += bandage[0];
            }
        }
        return health;
    }
}
