int solution(int[] inputArray) {
    int max = Integer.MIN_VALUE;
    
    for (int i = 1; i < inputArray.length; i++) {
        int tempAbsDiff = Math.abs(inputArray[i]-inputArray[i-1]);
        max = Math.max(max, tempAbsDiff);
    }
    
    return max;
}
