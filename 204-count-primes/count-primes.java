class Solution {
    public int countPrimes(int n) {
        if (n < 2) return 0;
        return primeSieve(n);
    }

    public static int primeSieve(int n) {        
        boolean[] notPrime = new boolean[n]; // false: Prime, true: composite
        notPrime[0] = true;
        notPrime[1] = true;

        for (int i = 2; i * i <= notPrime.length; i++) {
            if (!notPrime[i]) { // meaning is prime
                for (int j = 2; i * j < notPrime.length; j++) {
                    notPrime[i * j] = true;
                }
            }
        }
        int count = 0;
        for (int i = 2; i < notPrime.length; i++) {
            if (!notPrime[i]) count++;
        }
        return count;
    }
    

}
