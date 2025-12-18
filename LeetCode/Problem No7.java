class Solution {
    public int reverse(int x) {
        long range=0;
        while(x!=0){
            range= range*10 + x%10;
            x=x/10;
        }
        if(range < -2147483648 || range > 2147483647)
            return 0;
        return (int) range;
    }
}
