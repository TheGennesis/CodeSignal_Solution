boolean solution(int[] sequence) {
    int N = sequence.length;
    int count1 = 0, count2 = 0;
    
    if (N == 2)
        return true;
        
    for (int i = 0; i < N-1; i++) {
        if (sequence[i] >= sequence[i+1])
            count1++;
    }
    
    for (int i = 0; i < N-2; i++) {
        if (sequence[i] >= sequence[i+2])
            count2++;
    }
    
    return count1 <= 1 && count2 <= 1;
}