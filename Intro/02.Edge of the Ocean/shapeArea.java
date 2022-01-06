int solution(int n) {
    int tot = 1;
    
    for (int i = 1; i <= n; i++) {
        tot += i * 4 -4;
    }
    
    return tot;
}
