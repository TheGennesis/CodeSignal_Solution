int solution(int[] inputArray) {
    int prod = Integer.MIN_VALUE;
    
    for (int i = 1; i < inputArray.length; i++) {
        int temp = inputArray[i] * inputArray[i-1];
        prod = Math.max(prod, temp);
    }
    
    return prod;
}
