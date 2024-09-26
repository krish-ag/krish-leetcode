class Solution {
    public int reverse(int x) {
        boolean neg = x < 0;
        if (neg) x = x * -1;
        long rev = 0;
        while (x > 0){
            long t = x % 10;
            rev = rev * 10 + t;
            x /= 10; 
        }

        if (neg){
            rev *= -1;
        }


        if (rev > Math.pow(2, 31) - 1 || rev < -Math.pow(2, 31)) rev = 0;
        


        return (int)rev;
    }
}