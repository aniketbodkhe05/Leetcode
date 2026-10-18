class Solution {
    public int maxScore(int[] cardPoints, int k) {
        // int count=0;
        // int sum=0;
        // for(int i=cardPoints.length-1;i>=0;i--){
        //     if(count<k){
        //         sum=sum+cardPoints[i];
        //         count++;
        //     }

        // }
        // return sum;
        // int sum = 0;
        // for (int i = 0; i < k; i++) {
        //     sum += cardPoints[i];
        // }
        // int maxsum = sum;
        // int rightIndex = cardPoints.length - 1;
        // for (int i = k - 1; i >= 0; i--) {
        //     sum -= cardPoints[i];
        //     sum += cardPoints[rightIndex];

        //     rightIndex--;

        //     maxsum = Math.max(sum, maxsum);
        // }

        // return maxsum;

        int sum = 0;

        int rightIndex = cardPoints.length - 1;

        for (int i = 0; i < k; i++) {
            sum += cardPoints[i];
        }
        int maxsum = sum;
        for (int i = k - 1; i >= 0; i--) {
            sum -= cardPoints[i];

            sum += cardPoints[rightIndex];

            rightIndex--;

            maxsum = Math.max(sum, maxsum);
        }
        return maxsum;
    }
}