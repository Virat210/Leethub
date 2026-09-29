class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> al = new ArrayList<>();
        int n=intervals.length;
        int j=n;
        int start=newInterval[0];
        int end=newInterval[1];

        for(int i=0;i<n;i++){
            if(newInterval[0]>=intervals[i][0] &&
               newInterval[0]<=intervals[i][1]){
                start=Math.min(newInterval[0],intervals[i][0]);
                end=Math.max(newInterval[1],intervals[i][1]);
            }
            else if(newInterval[1]>=intervals[i][0] &&
                    newInterval[1]<=intervals[i][1]){
                start=Math.min(start,intervals[i][0]);
                end=Math.max(newInterval[1],intervals[i][1]);
            }
            else if(newInterval[0]<=intervals[i][0] &&
                    newInterval[1]>=intervals[i][1]){
                start=Math.min(start,intervals[i][0]);
                end=Math.max(end,intervals[i][1]);
            }
            else if(intervals[i][1]<start){
                al.add(intervals[i]);
            }
            else{
                j=i;
                break;
            }
        }

        al.add(new int[]{start,end});

        while(j<n){
            al.add(intervals[j]);
            j++;
        }

        return al.toArray(new int[al.size()][]);
    }
}