class Solution {
    public int minPathSum(int[][] grid) {
      int n = grid.length;
      int m = grid[0].length;
      int dp[][]= new int[n][m];
      for(int i =0 ; i<n ; i++ ){
        Arrays.fill(dp[i],-1);
      }
      return recall(grid,dp,0,0,  n ,  m );        
    }

    public int recall(int grid[][],int dp[][],int i , int j,int n , int m ){
      if(i==n-1 && j==m-1) return grid[i][j];
      if(dp[i][j]!=-1){
        return dp[i][j];
      }
      int down = Integer.MAX_VALUE;
      int right= Integer.MAX_VALUE;
      if(i!=n-1){
         down = grid[i][j]+recall(grid,dp,i+1,j,n,m);
      } 
      if(j!=m-1){
         right = grid[i][j]+recall(grid,dp,i,j+1,n,m);
      }

      return dp[i][j]=Math.min(right,down);
    }

}