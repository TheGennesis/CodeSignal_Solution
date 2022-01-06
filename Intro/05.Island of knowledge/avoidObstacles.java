int solution(int[] inputArray) {
    int mod = 2;
    
    for (int i = 0; i < inputArray.length; i++) {
        
        if (inputArray[i] % mod == 0) {
            mod++;
            i = -1;
        }
    }
    
    return mod;
}
