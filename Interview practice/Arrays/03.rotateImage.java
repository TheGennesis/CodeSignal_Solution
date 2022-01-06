int[][] solution(int[][] a) {
    int N = a.length;
    
    //transpose matrix
    for (int i = 0; i < N; i++) {
        for (int j = i; j < N; j++) {
            int temp = a[i][j];
            a[i][j] = a[j][i];
            a[j][i] = temp;
        }       
    }
    
    //swap row extremities
    for (int i = 0; i < N; i++) {
        for (int j = 0; j < (N/2); j++) {
            int temp = a[i][j];
            a[i][j] = a[i][N-1-j];
            a[i][N-1-j] = temp;
        }
    }
    
    return a;
}