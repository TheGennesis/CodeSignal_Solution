boolean solution(int n) {
    String number = Integer.toString(n);
    int N = number.length();
    
    int[] digits = new int[N];
    for (int i = 0; i < N; i++) {
        digits[i] = number.charAt(i) - '0';
    }
    
    int firstSum = 0, secondSum = 0;
    
    for (int i = 0; i < N/2; i++) {
        firstSum += digits[i];
        secondSum += digits[i+N/2];
    }
    
    return firstSum == secondSum;
}
