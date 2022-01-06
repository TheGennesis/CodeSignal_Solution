int[] solution(int[] a) {
    int[] res = new int[2];
    
    for (int i = 0; i < a.length; i++) {
        res[i%2] += a[i];
    }
    
    return res;
}
