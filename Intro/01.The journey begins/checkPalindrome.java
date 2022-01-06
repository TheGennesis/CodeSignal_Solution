boolean solution(String inputString) {
    if (inputString.length() == 1)
        return true;
        
    int index = 0;
    
    while (index < inputString.length()/2) {
        int last = inputString.length() -1 -index;
        
        if (inputString.charAt(index) != inputString.charAt(last))
            return false;
            
        index++;
    }
    
    return true;
}
