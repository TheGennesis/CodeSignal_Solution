boolean solution(String inputString) {
    int[] countLetters = new int[26];
    
    for (int i = 0; i < inputString.length(); i++) {
        char current = inputString.charAt(i);
        
        countLetters[current - 'a']++;
    }
    
    int countOdd = 0;
    
    for (int i = 0; i < 26; i++) {
        if (countLetters[i] % 2 != 0) countOdd++;
    }
    
    return countOdd <= 1;
}
