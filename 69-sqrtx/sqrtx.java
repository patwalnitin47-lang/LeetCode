class Solution {
    public int mySqrt(int x) {
        int b=0;

        for(int i=1;i<=x;i++){
            int r = x/i;

            if(r>=i){
                b=i;
            }else{
                break;
            }
        }       
        return b;
    }
}