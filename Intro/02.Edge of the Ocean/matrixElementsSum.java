int solution(int[][] matrix) {
    int sum = 0;
    
    for (int col = 0; col < matrix[0].length; col++) {
        for (int row = 0; row < matrix.length; row++) {
            
            if (matrix[row][col] == 0) {
                break;
            }
            
            else
                sum += matrix[row][col];
        }
    }  
    
    return sum;  
}
