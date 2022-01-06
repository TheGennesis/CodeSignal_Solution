int[][] solution(int[][] image) {
    int rows = image.length;
    int cols = image[0].length;
    
    int[][] res = new int[rows-2][cols-2];
    
    for (int i = 1; i < rows -1; i++) {
        for (int j = 1; j < cols -1; j++) {
            res[i-1][j-1] = getAverage(image, i, j);
        }
    }
    
    return res;
}

int getAverage(int[][] image, int actualRow, int actualCol) {
    
    /*
    CELLS REFERENCE:
    upper left:     -1 -1
    upper middle:   -1  0
    upper right:    -1 +1
    middle left:     0 -1
    middle middle:   0  0
    middle right:    0 +1
    down left:      +1 -1
    down middle:    +1  0
    down right:     +1 +1
    */
    
    int sum = image[actualRow-1][actualCol-1]+ image[actualRow-1][actualCol]+ image[actualRow-1][actualCol+1]+
              image[actualRow][actualCol-1]+ image[actualRow][actualCol]+ image[actualRow][actualCol+1]+
              image[actualRow+1][actualCol-1]+ image[actualRow+1][actualCol]+ image[actualRow+1][actualCol+1]; 
    
    return sum / 9;
}
