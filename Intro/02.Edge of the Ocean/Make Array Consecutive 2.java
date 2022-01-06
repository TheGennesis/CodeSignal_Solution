int solution(int[] statues) {
    if (statues.length == 1)
        return 0;
    
    Arrays.sort(statues);
    
    int res = 0;
    
    for (int i = 0; i < statues.length-1; i++) {
        int tempDiff = statues[i+1] - statues[i];
        
        if (tempDiff != 1)
            res += tempDiff-1;
    }
    
    return res;
}
