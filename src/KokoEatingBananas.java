public class KokoEatingBananas {
    public static void main(String[] args) {
        var solution = new KokoEatingBananas();
        int[] piles = {1, 4, 3, 2};
        int h = 9;
        int output = solution.minEatingSpeed(piles, h);
        System.out.println(output);
        // Output: 2
    }

    public int minEatingSpeed(int[] piles, int h) {
        int i = 1;
        int j = piles.length;
        while (i < j) {
            int k = i+(j-i)/2;
            int time = 0;
            for (int x = 0; x < piles.length; x++) {
                if (piles[x] <= k) time++;
                else time+=(piles[x] + k - 1)/k;
            }
            if (time > h) i = k + 1;
            else j = k;
        }
        return i;
    }
}
