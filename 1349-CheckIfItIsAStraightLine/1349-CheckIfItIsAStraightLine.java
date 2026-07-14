// Last updated: 14/07/2026, 11:22:37
class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        // First two points
        int x0 = coordinates[0][0], y0 = coordinates[0][1];
        int x1 = coordinates[1][0], y1 = coordinates[1][1];
        int dx = x1 - x0;
        int dy = y1 - y0;
        for (int i = 2; i < coordinates.length; i++) {
            int x = coordinates[i][0], y = coordinates[i][1];
            if ((y - y1) * dx != (x - x1) * dy) {
                return false;
            }
        }
        return true;
    }
}
