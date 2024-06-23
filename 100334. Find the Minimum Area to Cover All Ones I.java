class Solution {
    public int minimumArea(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int rmax = -1 , cmax = -1, rmin = n, cmin = m;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(grid[i][j] == 1){
                    if(i < rmin) rmin = i;
                    if(i > rmax) rmax = i;
                    if(j < cmin) cmin = j;
                    if(j > cmax) cmax = j;                
                }
            }
        }
        if(rmin == n || rmax == -1 || cmin == m || cmax == -1) return 0;
        return (rmax - rmin + 1) * (cmax - cmin + 1);

    }
}
