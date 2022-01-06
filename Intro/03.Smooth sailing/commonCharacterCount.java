int solution(String s1, String s2) {
    final int alphabetLength = 26;
    
    int[] count1 = new int[alphabetLength];
    int[] count2 = new int[alphabetLength];
    
    for (int i = 0; i < s1.length(); i++) {
        char c = s1.charAt(i);
        
        count1[c - 'a']++;
    }
    
    for (int i = 0; i < s2.length(); i++) {
        char c = s2.charAt(i);
        
        count2[c - 'a']++;
    }
    
    int sum = 0;
    
    for (int i = 0; i < alphabetLength; i++) {
        if (count1[i] != 0 && count2[i] != 0) {
            sum += Math.min(count1[i], count2[i]);
        }
    }
    
    return sum;
}
