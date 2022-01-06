boolean solution(char[][] grid) {
    int n = grid.length;
    
    Set<String> set = new HashSet<String>();
    
    for (int row = 0; row < n ; row++) {
        for (int col = 0; col < n; col++) {
            if (grid[row][col] != '.' && !set.add(grid[row][col] + " - row: " + row))
                return false;
            if (grid[row][col] != '.' && !set.add(grid[row][col] + " - col: " + col))
                return false;
            if (grid[row][col] != '.' && !set.add(grid[row][col] + " - square: " + row/3 + " " + col/3))
                return false;
        }
    } 
    
    return true;
}
