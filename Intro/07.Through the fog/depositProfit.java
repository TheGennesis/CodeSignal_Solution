int solution(int deposit, int rate, int threshold) {
    int res = 0;
    double newDeposit = (double)deposit;
    
    while (newDeposit < threshold) {
        newDeposit += newDeposit*rate/100;
        
        res++;
    }
    
    return res;
}
