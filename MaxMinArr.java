public class MaxMinArr {
    public static void main(String[] args) {
        int[][] a = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        int n = a.length;
        int m = a[0].length;
        
        for (int i = 0; i < n; i++) {
            int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
            for (int j = 0; j < m; j++) {
                min = Math.min(min, a[i][j]);
                max = Math.max(max, a[i][j]);
            }
            System.out.println("Row " + (i + 1) + " -> Min: " + min + ", Max: " + max);
        }
    }
}
