class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double mdia = 0.0;
        int area = 0;
        for (int i = 0; i < dimensions.length; i++) {
            double cdia = Math.sqrt(dimensions[i][0] * dimensions[i][0] + dimensions[i][1] * dimensions[i][1]);
            if (cdia > mdia || (cdia == mdia && dimensions[i][0] * dimensions[i][1] > area)) {
                mdia = cdia;
                area = dimensions[i][0] * dimensions[i][1];
            }
        }
        return area;
    }
}
