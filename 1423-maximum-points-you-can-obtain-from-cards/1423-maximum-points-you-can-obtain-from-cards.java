class Solution {
    public int maxScore(int[] cards, int k) {
        int n = cards.length;
        int sum = 0;
        int fsum=0;
        for(int i =0 ; i <n ; i++){
            fsum+=cards[i];
        }
        for(int i = 0; i < n-k; i++) {
            sum += cards[i];
        }

        int max_ans = sum;

        for(int j = n-k; j < n; j++) {
            sum += cards[j] -cards[j-(n-k)];
            max_ans = Math.min(max_ans,sum);
        }

        return fsum-max_ans;
        
    }
}