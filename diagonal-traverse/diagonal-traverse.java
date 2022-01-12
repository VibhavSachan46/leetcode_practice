class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int M = mat.length, N = mat[0].length;
        int[] result = new int[M * N];
        // level to keep track of flow of diagonal - 0 indexed
        // if level is even traverse from bottom to top
        // if level is odd traverse from top to bottom
        int level = 0, count = 0, i = 0, j = 0;
        while(count < (M * N)) {
            // if level is even - go to top from bottom
            if(level%2 == 0) {
                if(i > M-1) {
                    i = i - 1;
                    j = j + 2;
                } else {
                    j = 0;
                }
                while(i >= 0 && j < N) {
                    result[count++] = mat[i--][j++];
                }
            }
            // if level is odd - go to bottom from top
            else {
                 if(j > N -1) {
                     i = i + 2;
                     j = j - 1;
                } else {
                     i = 0;
                }
                while(i < M && j >= 0) {
                    result[count++] = mat[i++][j--];
                }
            }
            level++;
        }
        return result;
    }
}