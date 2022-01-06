int[][] solution(boolean[][] matrix) {
    int rows = matrix.length;
    int cols = matrix[0].length;
    
    int[][] res = new int[rows][cols];
    
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            
            int neighbors = 0;
            
            //u
            if (i > 0 && matrix[i-1][j])
                neighbors++;
            
            //d
            if (i+1 < rows && matrix[i+1][j])
                neighbors++;
            
            //l
            if (j > 0 && matrix[i][j-1])
                neighbors++;
            
            //r
            if (j+1 < cols && matrix[i][j+1])
                neighbors++;
            
            //ul
            if (i > 0 && j > 0 && matrix[i-1][j-1])
                neighbors++;
            
            //ur
            if (i > 0 && j+1 < cols && matrix[i-1][j+1])
                neighbors++;
            
            //dl
            if (i+1 < rows && j > 0 && matrix[i+1][j-1])
                neighbors++;
            
            //dr
            if (i+1 < rows && j+1 < cols && matrix[i+1][j+1])
                neighbors++; 
                
            res[i][j] = neighbors;
        }
    }
    
    
    return res;
}