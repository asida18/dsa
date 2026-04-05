/**
 * MEDIUM - Number of Islands
 * https://leetcode.com/problems/number-of-islands/
 *
 * Problem:
 *   Given an m x n 2D grid of '1's (land) and '0's (water), return the number of islands.
 *   An island is formed by connecting adjacent lands horizontally/vertically.
 *
 * Example:
 *   Input:  grid = [["1","1","0","0","0"],
 *                   ["1","1","0","0","0"],
 *                   ["0","0","1","0","0"],
 *                   ["0","0","0","1","1"]]
 *   Output: 3
 *
 * Approach: (your notes here)
 *
 * Time Complexity:  O(?)
 * Space Complexity: O(?)
 */
public class NumberOfIslands {
    public int numIslands(char[][] grid) {
        // TODO: implement
        return 0;
    }

    // --- Tests ---
    public static void main(String[] args) {
        NumberOfIslands sol = new NumberOfIslands();

        char[][] grid1 = {
            {'1','1','1','1','0'},
            {'1','1','0','1','0'},
            {'1','1','0','0','0'},
            {'0','0','0','0','0'}
        };
        assert sol.numIslands(grid1) == 1 : "Test 1 failed";

        char[][] grid2 = {
            {'1','1','0','0','0'},
            {'1','1','0','0','0'},
            {'0','0','1','0','0'},
            {'0','0','0','1','1'}
        };
        assert sol.numIslands(grid2) == 3 : "Test 2 failed";

        System.out.println("All tests passed!");
    }
}
